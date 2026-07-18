# MeshLink Android

MeshLink is an experimental Android MVP for peer-to-peer messaging over a
Bluetooth Low Energy mesh. It is designed to work without accounts, phone
numbers, or a central messaging server.

> This project is a prototype. It has not received an external security audit
> and should not be used for sensitive communication.

## MVP features

- Nearby peer discovery over Bluetooth LE
- Public, channel, and private messages
- Encrypted peer-to-peer sessions
- Multi-hop relay and basic store-and-forward delivery
- Jetpack Compose interface

Some experimental integrations remain in the source while the MVP is refined.

## Run locally

Requirements:

- Android Studio with JDK 17
- Android SDK 35
- An emulator or Android 8.0+ device

Open the project in Android Studio and run the `app` configuration. A physical
device is recommended for testing Bluetooth mesh behavior.

From a configured terminal, build a debug APK with:

```bash
./gradlew assembleDebug
```

The APK is written under `app/build/outputs/apk/debug/`.

## Project status

This repository intentionally keeps a small, development-focused setup. Release
automation, store metadata, issue templates, and publishing workflows are not
part of the MVP.

## License and privacy

See [LICENSE.md](LICENSE.md) and [PRIVACY_POLICY.md](PRIVACY_POLICY.md).
