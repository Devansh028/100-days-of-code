/*Question 2: Job Sequencing with Deadlines

Given jobs with deadlines and profits, schedule jobs to maximize total profit (one job per time slot).

Example:

Jobs = [(d=2,p=100),(d=1,p=19),(d=2,p=27),(d=1,p=25),(d=3,p=15)]
Output: Max Profit = 142 */

import java.util.*;

class Job {
    int deadline, profit;

    Job(int d, int p) {
        deadline = d;
        profit = p;
    }
}

public class JobSequencing {

    public static int maxProfit(Job[] jobs) {
        Arrays.sort(jobs, (a, b) -> b.profit - a.profit);

        int maxDeadline = 0;
        for (Job j : jobs)
            maxDeadline = Math.max(maxDeadline, j.deadline);

        boolean[] slot = new boolean[maxDeadline + 1];
        int profit = 0;

        for (Job job : jobs) {
            for (int d = job.deadline; d > 0; d--) {
                if (!slot[d]) {
                    slot[d] = true;
                    profit += job.profit;
                    break;
                }
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        Job[] jobs = {
                new Job(2, 100),
                new Job(1, 19),
                new Job(2, 27),
                new Job(1, 25),
                new Job(3, 15)
        };
        System.out.println(maxProfit(jobs)); // 142
    }
}
