class Computer {
    private String CPU;
    private String RAM;
    private boolean graphicsCard;
    private boolean bluetooth;

    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.graphicsCard = builder.graphicsCard;
        this.bluetooth = builder.bluetooth;
    }

    static class Builder {
        private String CPU;
        private String RAM;
        private boolean graphicsCard;
        private boolean bluetooth;

        Builder(String cpu, String ram) {
            this.CPU = cpu;
            this.RAM = ram;
        }

        Builder setGraphicsCard(boolean val) {
            this.graphicsCard = val;
            return this;
        }

        Builder setBluetooth(boolean val) {
            this.bluetooth = val;
            return this;
        }

        Computer build() {
            return new Computer(this);
        }
    }
}

public class BuilderPatternDemo {
    public static void main(String[] args) {
        Computer pc = new Computer.Builder("Intel i7", "16GB")
                .setGraphicsCard(true)
                .setBluetooth(true)
                .build();

        System.out.println("Computer built successfully");
    }
}
