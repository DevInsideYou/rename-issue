Here are 2 **independent** projects `a` and `b`.

Both have the exact same files: `Thingy`, `ThingyImpl` and `UsesThingy`.

A rename of `Thingy` to `Thingy2` in project `a` affects `ThingyImpl` and `UsesThingy` in **both** projects.

Expected behavior: **only** `ThingyImpl` and `UsesThingy` in project `a` should have been affected.

Reproduced in:
 * Scala `v2.13.6` and `v3.0.0`.
 * Metals `v0.10.4`.
 * Visual Studio Code `v1.57.1`.
 * Bloop `v1.4.8-19-4d9f966b`.
 * Flyway `v7.9.0`.
