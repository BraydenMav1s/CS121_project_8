# CS121_project_8

# Bank on it

# Algorithm 

### Display Menu

- Show the user a menu with the following options:

- 0) Exit System

- 1) Login as Admin

- 2) Login as Customer

- 3) Prompt the user for a choice (0-2).

- Read user input.

### Handle Menu Selection
- If the user enters 0, exit the program.

- If the user enters 1, attempt Admin login.

- If the user enters 2, attempt Customer login.

- If the input is invalid, display an error message and re-prompt.

### Admin Login
- Prompt the user for Admin username and PIN.

- Check if the credentials match the default admin credentials (admin and 0000).

- If the credentials are correct, show the Admin menu.

- If incorrect, display an error message and re-prompt.

### Admin Menu
- If the user selects option 0, exit the Admin menu and return to the main menu.

- If the user selects option 1 (Full Customer Report):

- Display a list of all customers with their checking and savings account balances.

- If the user selects option 2 (Add User):

- Prompt for a new username and PIN.

- Create a new customer with that information and add it to the customer list.

- Confirm the new user has been added and return to the Admin menu.

- If the user selects option 3 (Apply Interest to Savings Accounts):

- Loop through each customer and apply interest to their savings account.

- Print updated balances after applying interest for each customer.

### Customer Login
- Prompt the user for Customer username and PIN.

- Loop through the customer list to find a match:

- If a match is found, set currentCustomer to that customer and display the Customer menu.

- If no match is found, display a login failure message and return to the main menu.

### Customer Menu
- Display a menu with the following options:

- 0) Exit Customer Menu

- 1) Check Balances

- 2) Deposit Funds

- 3) Withdraw Funds

- 4) Transfer Funds

- Prompt the user for a choice (0-4).

- Handle each option:

- If the user selects option 1, display the checking and savings balances of the current customer.

- If the user selects option 2, prompt the user for the deposit amount, update the balance, and confirm the deposit.

- If the user selects option 3, prompt the user for the withdrawal amount, update the balance, and confirm the withdrawal.

- If the user selects option 4, prompt the user for the transfer amount, transfer funds from one account to another (checking to savings or vice versa), and confirm the transfer.
