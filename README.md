# @happy-gastro/app-killer

React Native Android module to completely close (kill) the app.

## Installation

```sh
npm install @happy-gastro/app-killer
```

## Usage

```js
import AppKiller from '@happy-gastro/app-killer';

// To kill the app:
AppKiller.killApp();
```

## Android Setup

Add package to your MainApplication.java:

```java
@Override
protected List<ReactPackage> getPackages() {
  List<ReactPackage> packages = new PackageList(this).getPackages();
  packages.add(new AppKillerPackage()); // <-- Add this
  return packages;
}
```