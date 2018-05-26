/**
 * Creates demo account
 */

print('dump start');

db.accounts.update(
    { "_id": "demo" },
    {
    "_id": "demo",
    "lastSeen": new Date(),
    "name": "demo",
    "note": "note",
    "email": "email@domain.com"
    },
    { upsert: true }
);

print('dump complete');