You will be creating an Object Class Definition and a Test Class (main) to show your methods work.
Consider the problem of designing a CookieCanister object to model a traditional cookie canister. Each cookie canister includes the following:

type of cookies it currently holds (it is not appropriate to mix cookie types in the canister)
the maximum capacity of the cookie canister (should be a constant)
number of cookies in the canister
whether the canister is open or closed
When a new cookie canister is created, it must be assigned a cookie type and a maximum capacity. New cookie canisters do not contain any cookies and come from the factory closed.

Operations on a cookie canister include the following:
Dispense some quantity of cookies from the canister. If an attempt is made to remove more than the number of cookies currently in the canister, all are removed.
Add some quantity of cookies to the canister. If an attempt is made to add more cookies than is needed to fill the canister to capacity, just add those that are needed to fill canister to capacity. No forcing extra cookies in the canister, as that will cause some to be crushed.
Fill the canister to capacity.
Open canister.
Close canister.
Retrieve the cookie type of the cookies in the canister.
Retrieve the maximum capacity of the cookie canister.
Retrieve the number of cookies in the canister.
Retrieve the open/closed status of the cookies in the canister.
Retrieve a string containing all of the attributes of the cookie canister. Label the information.
Write the class declaration for the CookieCanister object. In writing this class you must:
Choose appropriate instance variables and method names Provide the functionality specified above.
