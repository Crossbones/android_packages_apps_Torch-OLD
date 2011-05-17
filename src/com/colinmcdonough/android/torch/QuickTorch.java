package com.colinmcdonough.android.torch;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;

public class QuickTorch extends Activity {

  private static final String TAG = QuickTorch.class.getSimpleName();
  
  /**
   * Start Torch when triggered
   */
  @Override
  public void onStart() {
    super.onStart();
    Log.d(TAG, "onStart()");
    if (Torch.getTorch() == null) {
      Log.d(TAG, "torch == null");
      Intent intent = new Intent(this, Torch.class);
      startActivity(intent);
    } else {
      Log.d(TAG, "torch != null");
    }
    finish();
  }
}
