package org.happysolutions.app;

import android.os.Process;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class AppKillerModule extends ReactContextBaseJavaModule {

  public AppKillerModule(ReactApplicationContext context) {
    super(context);
  }

  @Override
  public String getName() {
    return "AppKiller";
  }

  @ReactMethod
  public void killApp() {
    Process.killProcess(Process.myPid());
  }
}