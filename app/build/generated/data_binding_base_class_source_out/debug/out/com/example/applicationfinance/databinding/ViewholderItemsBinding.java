// Generated by view binder compiler. Do not edit!
package com.example.applicationfinance.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.applicationfinance.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ViewholderItemsBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView pic;

  @NonNull
  public final TextView pricTxt;

  @NonNull
  public final TextView timetxt;

  @NonNull
  public final TextView titleTxt;

  private ViewholderItemsBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView pic,
      @NonNull TextView pricTxt, @NonNull TextView timetxt, @NonNull TextView titleTxt) {
    this.rootView = rootView;
    this.pic = pic;
    this.pricTxt = pricTxt;
    this.timetxt = timetxt;
    this.titleTxt = titleTxt;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ViewholderItemsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ViewholderItemsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.viewholder_items, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ViewholderItemsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.pic;
      ImageView pic = ViewBindings.findChildViewById(rootView, id);
      if (pic == null) {
        break missingId;
      }

      id = R.id.pricTxt;
      TextView pricTxt = ViewBindings.findChildViewById(rootView, id);
      if (pricTxt == null) {
        break missingId;
      }

      id = R.id.timetxt;
      TextView timetxt = ViewBindings.findChildViewById(rootView, id);
      if (timetxt == null) {
        break missingId;
      }

      id = R.id.titleTxt;
      TextView titleTxt = ViewBindings.findChildViewById(rootView, id);
      if (titleTxt == null) {
        break missingId;
      }

      return new ViewholderItemsBinding((ConstraintLayout) rootView, pic, pricTxt, timetxt,
          titleTxt);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
