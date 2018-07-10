
# react-native-my-toast

## Getting started

`$ npm install react-native-my-toast --save`

### Mostly automatic installation

`$ react-native link react-native-my-toast`

### Manual installation


#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNMyToastPackage;` to the imports at the top of the file
  - Add `new RNMyToastPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-my-toast'
  	project(':react-native-my-toast').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-my-toast/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-my-toast')
  	```


## Usage
```javascript
import RNMyToast from 'react-native-my-toast';

// TODO: What to do with the module?
RNMyToast;
```
  