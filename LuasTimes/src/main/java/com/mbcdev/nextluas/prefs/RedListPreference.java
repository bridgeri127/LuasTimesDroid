package com.mbcdev.nextluas.prefs;

import android.content.Context;
import android.util.AttributeSet;

import com.mbcdev.nextluas.constants.StopConstants;

public class RedListPreference extends MultiSelectListPreference {

	public RedListPreference(Context context, AttributeSet attrs) {
		super(context, attrs, StopConstants.getStopNameArray(StopConstants.getRedStops()));
	}
}
