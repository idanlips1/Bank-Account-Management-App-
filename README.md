# Bank-Account-Management-App-
Project Overview

The Bank Account Management Application is a Java-based project that simulates banking operations for checking and savings accounts. It features account creation, transaction handling, and automated account management with interest calculations, all based on input data read from a CSV file. This program is structured with a modular, object-oriented approach, incorporating abstract classes and interfaces to enable scalability for different account types.

Key Features

Account Types: Supports both Checking and Savings accounts, each with distinct features like debit cards and safety deposit boxes.
Automatic Account Number Generation: Generates unique account numbers based on user SSN, account type, and other factors.
Interest Calculation and Compounding: Applies and compounds interest based on base rate adjustments.
CSV Integration: Reads and processes data from a CSV file to automatically create and initialize account information.
Classes and Structure

Account (Abstract): Base class for accounts, defining common properties like account number, balance, and interest rate.
Checking and Savings: Extend the Account class with unique features like debit card information and safety deposit boxes, respectively.
CSV Utility: Reads CSV data for streamlined account initialization.
