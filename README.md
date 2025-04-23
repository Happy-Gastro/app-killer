# @happy-gastro/app-killer

**React Native Android module to completely kill the app programmatically.**

This module allows you to terminate your Android application from JavaScript using a native bridge. It is useful for kiosk apps, special flows, or system-level utility applications where controlled termination is required.

---

## 📦 Installation

```sh
npm install @happy-gastro/app-killer --save
or
yarn add @happy-gastro/app-killer --save
```

---

## ⚙️ Android Setup

This package has auto-linking for Android 0.60+. If you are using an older version, please install it manually as shown below:

Add the native package to your `MainApplication.java`:

```java
import org.happysolutions.app.AppKillerPackage; // <-- Import this

@Override
protected List<ReactPackage> getPackages() {
  List<ReactPackage> packages = new PackageList(this).getPackages();
  packages.add(new AppKillerPackage()); // <-- Add this line
  return packages;
}
```

---

## 🚀 Usage

```js
import AppKiller from '@happy-gastro/app-killer';

// Kill the app
AppKiller.killApp();
```

> **Note:** This only works on Android. iOS does not allow programmatic app termination.

---

## 📁 Project Structure

```
@happy-gastro/app-killer/
├── index.js
├── package.json
├── README.md
└── android/
    └── src/
        └── main/
            └── java/
                └── org/
                    └── happysolutions/
                        └── app/
                            ├── AppKillerModule.java
                            └── AppKillerPackage.java
```

---

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

# Author

This project is developed and maintained by Farkas Ferenc.

- **Name**: Farkas Ferenc
- **Email**: [ferenc.farkas@happygastro.hu](mailto:ferenc.farkas@happygastro.hu)
- **Website**: [www.happygastro.hu](http://www.happygastro.hu)

## Company

Happy Gastro Ltd.

## License
[MIT](https://choosealicense.com/licenses/mit/)