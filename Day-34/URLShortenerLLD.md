# URL Shortener – Low Level Design

## Requirements

- Convert long URL → short URL
- Redirect short URL → original URL
- Handle large traffic
- URLs should be unique

## Core Components

- Controller
- Service
- Repository
- Database

## Entities

class UrlMapping {
String shortUrl;
String longUrl;
LocalDateTime createdAt;
}

## Flow

1. Client sends long URL
2. Service generates unique short key
3. Save mapping in DB
4. Return short URL
5. Redirect on access

## Key Design Decisions

- Base62 encoding for short key
- HashMap / DB index on shortUrl
- Read-heavy system → caching

## Interview Line

"I optimized for fast reads and scalability."
