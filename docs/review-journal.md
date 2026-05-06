# Review Journal

The repository goal stays the same: design a Kotlin verification harness for cache systems, covering diagnostic reporting, negative fixtures, and failure-oriented tests. This note explains the added review angle.

The local checks classify each case as `ship`, `watch`, or `hold`. That gives the project a small review vocabulary that matches its backend services focus without claiming live deployment or external usage.

## Cases

- `baseline`: `queue pressure`, score 148, lane `ship`
- `stress`: `retry load`, score 175, lane `ship`
- `edge`: `worker slack`, score 190, lane `ship`
- `recovery`: `session drift`, score 127, lane `watch`
- `stale`: `queue pressure`, score 141, lane `ship`

## Note

A future change should add new cases before it changes the scoring rule.
