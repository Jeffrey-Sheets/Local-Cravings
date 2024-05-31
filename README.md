# Local Cravings
### Made by:
---
#### Jeffrey Sheets
---

## 1 Introduction

Everyone has cravings when they are hungry. But when you're on vacation you don't want a large corporate chain that you've been to a thousand times, that's where **Local Cravings** comes in. This app gathers all the local restaurants in your area and shows them to you. You can filter out restraunts based on their star rating, what food they offer, and other aspects that may dictate where you'll go.

## 2 Architectural Design

**Local Cravings** will be primarily programmed in Kotlin. While we will also utilize googles placeID API to aquire the information on restraunts in a certain area. For the server side the app will use Firebase to store information like the profiles of the users and which restaurants they have favorited.

## 3 User Guide

### 3.1 Client Side

#### 3.1.1 Starting the Application
Once the user has downloaded the app onto their android device, an icon will appear on their home screen. From there they can click on their icon where they will be presented with the login screen which will prompt them to create an account if they don't already have one.

#### 3.1.2 Registration
In the registration screen the user can enter their email once and their password twice. This information will create a new account in the firbase database where all their information will be stored.

<p align="center">
  <img src="Registration/Registration.jpg" width="200" title="registration">
  <br>
  <br>
  Figure 1: The registration screen
</p>

#### 3.1.3 Login
As stated before the login screen prompts the user to register for an account if they don't have one. When the user enters their credentials they are compared to the ones on in firebase and if they are found they will log the user in with all of their saved information.

<p align="center">
  <img src="Login/Login.jpg" width="200" title="Login">
  <br>
  <br>
  Figure 1: The Login screen
</p>
