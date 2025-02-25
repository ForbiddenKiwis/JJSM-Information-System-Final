// Generated by view binder compiler. Do not edit!
package com.example.jjsminventoria.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.jjsminventoria.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityCreateAccountBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnCACreateAccount;

  @NonNull
  public final Button btnCAReturn;

  @NonNull
  public final EditText etCAConfirmPassword;

  @NonNull
  public final EditText etCAName;

  @NonNull
  public final EditText etCAPassword;

  @NonNull
  public final EditText etCARole;

  @NonNull
  public final EditText etCAUsername;

  @NonNull
  public final ConstraintLayout main;

  @NonNull
  public final TextView tvCAConfirmPassword;

  @NonNull
  public final TextView tvCAName;

  @NonNull
  public final TextView tvCAPassword;

  @NonNull
  public final TextView tvCARole;

  @NonNull
  public final TextView tvCAUserId;

  @NonNull
  public final TextView tvCAUserIdLabel;

  @NonNull
  public final TextView tvCAUsername;

  @NonNull
  public final TextView tvTitleCreateAccount;

  private ActivityCreateAccountBinding(@NonNull ConstraintLayout rootView,
      @NonNull Button btnCACreateAccount, @NonNull Button btnCAReturn,
      @NonNull EditText etCAConfirmPassword, @NonNull EditText etCAName,
      @NonNull EditText etCAPassword, @NonNull EditText etCARole, @NonNull EditText etCAUsername,
      @NonNull ConstraintLayout main, @NonNull TextView tvCAConfirmPassword,
      @NonNull TextView tvCAName, @NonNull TextView tvCAPassword, @NonNull TextView tvCARole,
      @NonNull TextView tvCAUserId, @NonNull TextView tvCAUserIdLabel,
      @NonNull TextView tvCAUsername, @NonNull TextView tvTitleCreateAccount) {
    this.rootView = rootView;
    this.btnCACreateAccount = btnCACreateAccount;
    this.btnCAReturn = btnCAReturn;
    this.etCAConfirmPassword = etCAConfirmPassword;
    this.etCAName = etCAName;
    this.etCAPassword = etCAPassword;
    this.etCARole = etCARole;
    this.etCAUsername = etCAUsername;
    this.main = main;
    this.tvCAConfirmPassword = tvCAConfirmPassword;
    this.tvCAName = tvCAName;
    this.tvCAPassword = tvCAPassword;
    this.tvCARole = tvCARole;
    this.tvCAUserId = tvCAUserId;
    this.tvCAUserIdLabel = tvCAUserIdLabel;
    this.tvCAUsername = tvCAUsername;
    this.tvTitleCreateAccount = tvTitleCreateAccount;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityCreateAccountBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityCreateAccountBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_create_account, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityCreateAccountBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnCACreateAccount;
      Button btnCACreateAccount = ViewBindings.findChildViewById(rootView, id);
      if (btnCACreateAccount == null) {
        break missingId;
      }

      id = R.id.btnCAReturn;
      Button btnCAReturn = ViewBindings.findChildViewById(rootView, id);
      if (btnCAReturn == null) {
        break missingId;
      }

      id = R.id.etCAConfirmPassword;
      EditText etCAConfirmPassword = ViewBindings.findChildViewById(rootView, id);
      if (etCAConfirmPassword == null) {
        break missingId;
      }

      id = R.id.etCAName;
      EditText etCAName = ViewBindings.findChildViewById(rootView, id);
      if (etCAName == null) {
        break missingId;
      }

      id = R.id.etCAPassword;
      EditText etCAPassword = ViewBindings.findChildViewById(rootView, id);
      if (etCAPassword == null) {
        break missingId;
      }

      id = R.id.etCARole;
      EditText etCARole = ViewBindings.findChildViewById(rootView, id);
      if (etCARole == null) {
        break missingId;
      }

      id = R.id.etCAUsername;
      EditText etCAUsername = ViewBindings.findChildViewById(rootView, id);
      if (etCAUsername == null) {
        break missingId;
      }

      ConstraintLayout main = (ConstraintLayout) rootView;

      id = R.id.tvCAConfirmPassword;
      TextView tvCAConfirmPassword = ViewBindings.findChildViewById(rootView, id);
      if (tvCAConfirmPassword == null) {
        break missingId;
      }

      id = R.id.tvCAName;
      TextView tvCAName = ViewBindings.findChildViewById(rootView, id);
      if (tvCAName == null) {
        break missingId;
      }

      id = R.id.tvCAPassword;
      TextView tvCAPassword = ViewBindings.findChildViewById(rootView, id);
      if (tvCAPassword == null) {
        break missingId;
      }

      id = R.id.tvCARole;
      TextView tvCARole = ViewBindings.findChildViewById(rootView, id);
      if (tvCARole == null) {
        break missingId;
      }

      id = R.id.tvCAUserId;
      TextView tvCAUserId = ViewBindings.findChildViewById(rootView, id);
      if (tvCAUserId == null) {
        break missingId;
      }

      id = R.id.tvCAUserIdLabel;
      TextView tvCAUserIdLabel = ViewBindings.findChildViewById(rootView, id);
      if (tvCAUserIdLabel == null) {
        break missingId;
      }

      id = R.id.tvCAUsername;
      TextView tvCAUsername = ViewBindings.findChildViewById(rootView, id);
      if (tvCAUsername == null) {
        break missingId;
      }

      id = R.id.tvTitleCreateAccount;
      TextView tvTitleCreateAccount = ViewBindings.findChildViewById(rootView, id);
      if (tvTitleCreateAccount == null) {
        break missingId;
      }

      return new ActivityCreateAccountBinding((ConstraintLayout) rootView, btnCACreateAccount,
          btnCAReturn, etCAConfirmPassword, etCAName, etCAPassword, etCARole, etCAUsername, main,
          tvCAConfirmPassword, tvCAName, tvCAPassword, tvCARole, tvCAUserId, tvCAUserIdLabel,
          tvCAUsername, tvTitleCreateAccount);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
