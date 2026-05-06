# Thread Svc Cache Hub Walkthrough

I use this file as a small checklist before changing the Kotlin implementation.

| Case | Focus | Score | Lane |
| --- | --- | ---: | --- |
| baseline | queue pressure | 148 | ship |
| stress | retry load | 175 | ship |
| edge | worker slack | 190 | ship |
| recovery | session drift | 127 | watch |
| stale | queue pressure | 141 | ship |

Start with `edge` and `recovery`. They create the widest contrast in this repository's fixture set, which makes them better review anchors than the middle cases.

If `recovery` becomes less cautious without a clear reason, I would inspect the drag input first.
