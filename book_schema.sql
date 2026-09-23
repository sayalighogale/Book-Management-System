-- Run this in MySQL before starting the app
-- Uses the same database as your CafeManagementSystem project (miniproject)
-- so both apps can share one MySQL instance, each with its own table.

CREATE DATABASE IF NOT EXISTS miniproject;
USE miniproject;

CREATE TABLE IF NOT EXISTS book (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    author VARCHAR(100) NOT NULL,
    price DOUBLE NOT NULL,
    quantity INT NOT NULL,
    category VARCHAR(50)
);
