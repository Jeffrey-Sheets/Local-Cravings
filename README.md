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
  <img src="[Registration/Registration.jpeg](https://private-user-images.githubusercontent.com/84060666/335752484-9c5411d0-9632-456f-a484-4419fc0c3f4d.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MTcxOTkxMDUsIm5iZiI6MTcxNzE5ODgwNSwicGF0aCI6Ii84NDA2MDY2Ni8zMzU3NTI0ODQtOWM1NDExZDAtOTYzMi00NTZmLWE0ODQtNDQxOWZjMGMzZjRkLnBuZz9YLUFtei1BbGdvcml0aG09QVdTNC1ITUFDLVNIQTI1NiZYLUFtei1DcmVkZW50aWFsPUFLSUFWQ09EWUxTQTUzUFFLNFpBJTJGMjAyNDA1MzElMkZ1cy1lYXN0LTElMkZzMyUyRmF3czRfcmVxdWVzdCZYLUFtei1EYXRlPTIwMjQwNTMxVDIzNDAwNVomWC1BbXotRXhwaXJlcz0zMDAmWC1BbXotU2lnbmF0dXJlPTkyMmY5ODg0MGM3Nzc2NTNmZWY1OGI0MDE0OGQxYTk1YjViNGY3ZDkyNmE4ZTQ1YWU0NDkxZjljNmE4MmEwN2YmWC1BbXotU2lnbmVkSGVhZGVycz1ob3N0JmFjdG9yX2lkPTAma2V5X2lkPTAmcmVwb19pZD0wIn0._RGe0SfNaobFl0VJ4lfW9g-8nhv5g8nbChv9HpfWD-Y)" width="500" title="registration">
  <br>
  <br>
  Figure 1: The registration screen
</p>
