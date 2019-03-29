/*
 * Copyright (C) 2017 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.ebupt.telecom.incalluipigeonhole.constants;

import android.content.Context;
import android.support.annotation.NonNull;

/** Provider config values for AOSP Dialer. */
public class ConstantsImpl extends Constants {

  @Override
  @NonNull
  public String getFilteredNumberProviderAuthority() {
    return "com.ebupt.telecom.incalluipigeonhole.Dialer.blocking.filterednumberprovider";
  }

  @Override
  @NonNull
  public String getFileProviderAuthority() {
    return "com.ebupt.telecom.incalluipigeonhole.Dialer.files";
  }

  @NonNull
  @Override
  public String getAnnotatedCallLogProviderAuthority() {
    return "com.ebupt.telecom.incalluipigeonhole.Dialer.annotatedcalllog";
  }

  @NonNull
  @Override
  public String getPhoneLookupHistoryProviderAuthority() {
    return "com.ebupt.telecom.incalluipigeonhole.Dialer.phonelookuphistory";
  }

  @NonNull
  @Override
  public String getPreferredSimFallbackProviderAuthority() {
    return "com.ebupt.telecom.incalluipigeonhole.Dialer.preferredsimfallback";
  }

  @Override
  public String getUserAgent(Context context) {
    return "ColorShow";
  }

  @NonNull
  @Override
  public String getSettingsActivity() {
    return "com.ebupt.telecom.incalluipigeonhole.Dialer.app.settings.DialerSettingsActivity";
  }
}
