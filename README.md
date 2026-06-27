# Cinema Ticketing System

We would like to create a ticketing system for a cinema.

The cinema shows movies on screenings and sells two kinds of tickets: **Regular tickets** and **Group tickets**.

---

## Cinema

- has a name
- stores all screenings
- can add a new screening
- can calculate the total income from all screenings
- can list all screenings of a specific genre

---

## Screening

- the movie being shown
- date of the screening (`LocalDate`)
- list of sold tickets

**Functional requirements:**
- A screening can be created with a movie and a date.
- A new ticket can be added to a screening.
- The screening can calculate its own total income.

**Design requirements:**
- The date must be represented as a `LocalDate`.
- Tickets must be stored in a `List`.

---

## Ticket *(abstract)*

- seat number
- price of the ticket *(abstract)*

---

## RegularTicket

Price is determined by `TicketType`.

**Functional requirements:**
- A regular ticket is created with a seat number and a `TicketType`.
- Price is derived from the ticket type.

---

## GroupTicket

- number of people in the group
- price = `groupSize × 1800 Ft`

**Functional requirements:**
- A group ticket is created with a seat number and the number of people.
- Price is calculated from the group size.

---

## Movie

- title
- genre (`Genre` enum)
- duration in minutes

**Functional requirements:**
- A movie can be created with a title, genre, and duration.
- The system can retrieve all three fields.

**Design requirements:**
- Genre must be represented as an enum.

---

## Genre

| Constant  |
|-----------|
| `ACTION`  |
| `COMEDY`  |
| `DRAMA`   |
| `HORROR`  |
| `SCIFI`   |

**Design requirements:**
- Enum constant names must be uppercase.

---

## TicketType

| Constant | Price (Ft) |
|----------|------------|
| `CHILD`  | 1200       |
| `ADULT`  | 2000       |
| `SENIOR` | 1500       |

**Design requirements:**
- Each type stores its price as a field.
- The enum constructor must be private.

---

## What to implement

- Create several `Movie` objects with different genres.
- Create several `Screening` objects with manually set dates (`LocalDate.of(...)`).
- Sell a mix of `RegularTicket` and `GroupTicket` for each screening.
- Print all screening details and their individual incomes to the console.
- Print the cinema's total income.
- List all screenings of a specific genre.
