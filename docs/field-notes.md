# Field Notes

`thread-svc-cache-hub` is easiest to review by starting with the fixture, not the prose.

The domain cases cover `queue pressure`, `retry load`, `worker slack`, and `session drift`. They sit beside the smaller starter fixture so the project has both a compact scoring check and a domain-flavored review check.

`edge` tells me the happy path still works. `recovery` tells me whether the guardrail still has teeth.

The language-specific addition keeps the review model in a JVM-friendly data class.
