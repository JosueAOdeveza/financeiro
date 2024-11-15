// Generated by view binder compiler. Do not edit!
package com.example.applicationfinance.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.applicationfinance.R;
import com.mikhaellopez.circularprogressbar.CircularProgressBar;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ViewholderBudgetBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final CircularProgressBar circularProgressBar;

  @NonNull
  public final TextView percentTxt;

  @NonNull
  public final TextView priceTxt;

  @NonNull
  public final TextView titleTxt;

  private ViewholderBudgetBinding(@NonNull ConstraintLayout rootView,
      @NonNull CircularProgressBar circularProgressBar, @NonNull TextView percentTxt,
      @NonNull TextView priceTxt, @NonNull TextView titleTxt) {
    this.rootView = rootView;
    this.circularProgressBar = circularProgressBar;
    this.percentTxt = percentTxt;
    this.priceTxt = priceTxt;
    this.titleTxt = titleTxt;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ViewholderBudgetBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ViewholderBudgetBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.viewholder_budget, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ViewholderBudgetBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.circularProgressBar;
      CircularProgressBar circularProgressBar = ViewBindings.findChildViewById(rootView, id);
      if (circularProgressBar == null) {
        break missingId;
      }

      id = R.id.percentTxt;
      TextView percentTxt = ViewBindings.findChildViewById(rootView, id);
      if (percentTxt == null) {
        break missingId;
      }

      id = R.id.price_Txt;
      TextView priceTxt = ViewBindings.findChildViewById(rootView, id);
      if (priceTxt == null) {
        break missingId;
      }

      id = R.id.titleTxt;
      TextView titleTxt = ViewBindings.findChildViewById(rootView, id);
      if (titleTxt == null) {
        break missingId;
      }

      return new ViewholderBudgetBinding((ConstraintLayout) rootView, circularProgressBar,
          percentTxt, priceTxt, titleTxt);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
