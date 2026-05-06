# thread-svc-cache-hub

`thread-svc-cache-hub` is a Kotlin project in backend services. Its focus is to design a Kotlin verification harness for cache systems, covering diagnostic reporting, negative fixtures, and failure-oriented tests.

## Problem It Tries To Make Smaller

I want this repository to be useful as a quick reading exercise: fixtures first, implementation second, verifier last.

## Thread Svc Cache Hub Review Notes

`edge` and `recovery` are the cases worth reading first. They show the optimistic and cautious ends of the fixture.

## Working Pieces

- `fixtures/domain_review.csv` adds cases for queue pressure and retry load.
- `metadata/domain-review.json` records the same cases in structured form.
- `config/review-profile.json` captures the read order and the two review questions.
- `examples/thread-svc-cache-walkthrough.md` walks through the case spread.
- The Kotlin code includes a review path for `worker slack` and `session drift`.
- `docs/field-notes.md` explains the strongest and weakest cases.

## Design Notes

The repository has two validation layers: the original compact policy fixture and the domain review fixture. They are separate so one can change without hiding failures in the other.

The Kotlin code keeps the review rule close to the tests.

## Example Run

```powershell
powershell -NoProfile -ExecutionPolicy Bypass -File scripts/verify.ps1
```

## Tests

The check exercises the source code and the review fixture. `edge` is the high score at 190; `recovery` is the low score at 127.

## Known Limits

No external service is required. A deeper version would add more negative cases and a clearer boundary around invalid input.
