# Newspaper App

A lightweight Android news aggregator that utilizes the WebView framework to provide access to multiple Bangladeshi news portals within a single application environment.

---

## Technical Overview

The application is built on a standard Model-View-Controller architecture. It manages web navigation using a custom `WebViewClient` and provides a curated list of news sources via a Material Design options menu.

### Core Components
* **UI Structure:** `LinearLayout` with an `AppBarLayout` container.
* **Component Communication:** `onOptionsItemSelected` handling URL routing.
* **Web Engine:** `WebView` with JavaScript execution enabled.

---

## Application Media

### Screenshots
The following images represent the primary user interface and the newspaper selection menu.

![Main View](
<img width="198" height="259" alt="Image" src="https://github.com/user-attachments/assets/7f445279-0485-477f-b3d5-bf37f2b96508" />
*Figure 1: Main news viewing interface.*

![Menu View](
<img width="1" height="259" alt="Image" src="https://github.com/user-attachments/assets/7f445279-0485-477f-b3d5-bf37f2b96508" />
*Figure 2: Selection menu for newspaper sources.*

### Operation Video
A recorded demonstration of the application's navigation flow and site switching capabilities can be viewed here:

[Watch: Application Navigation Demo](
https://github.com/user-attachments/assets/f340a91b-7259-4619-af4f-ade2cb55f2ee)

---

## Code Breakdown

### URL Mapping Logic
The application maps menu resource IDs to specific web strings:
- **Prothom Alo:** `https://www.prothomalo.com/`
- **The Daily Star:** `https://www.thedailystar.net/`
- **Kaler Kantho:** `https://www.kalerkantho.com/`

### Navigation Handling
The system overrides `onBackPressed()` to ensure the web history is prioritized over the application activity stack, preventing accidental app closure during browsing.

---

## Project Setup

### Prerequisites
- Android Studio Ladybug or later.
- JDK 17+.
- Android API Level 24+ (Nougat).

### Deployment
1. Import the project into Android Studio.
2. Verify `INTERNET` permission in the Manifest.
3. Build the APK or run via ADB on a physical device.

## Author
[Rahul Singha]
