// Generated by view binder compiler. Do not edit!
package com.shopapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.shopapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityCheckoutBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final ImageButton backButton;

  @NonNull
  public final RadioButton codRadio;

  @NonNull
  public final EditText customerName;

  @NonNull
  public final EditText customerPhone;

  @NonNull
  public final EditText deliveryAddress;

  @NonNull
  public final RadioButton onlineRadio;

  @NonNull
  public final RadioGroup paymentMethodGroup;

  @NonNull
  public final Button placeOrderButton;

  @NonNull
  public final ImageView productImage;

  @NonNull
  public final TextView productName;

  @NonNull
  public final TextView productPrice;

  @NonNull
  public final TextView productQuantity;

  @NonNull
  public final TextView shippingAmount;

  @NonNull
  public final TextView subtotalAmount;

  @NonNull
  public final TextView totalAmount;

  private ActivityCheckoutBinding(@NonNull ScrollView rootView, @NonNull ImageButton backButton,
      @NonNull RadioButton codRadio, @NonNull EditText customerName,
      @NonNull EditText customerPhone, @NonNull EditText deliveryAddress,
      @NonNull RadioButton onlineRadio, @NonNull RadioGroup paymentMethodGroup,
      @NonNull Button placeOrderButton, @NonNull ImageView productImage,
      @NonNull TextView productName, @NonNull TextView productPrice,
      @NonNull TextView productQuantity, @NonNull TextView shippingAmount,
      @NonNull TextView subtotalAmount, @NonNull TextView totalAmount) {
    this.rootView = rootView;
    this.backButton = backButton;
    this.codRadio = codRadio;
    this.customerName = customerName;
    this.customerPhone = customerPhone;
    this.deliveryAddress = deliveryAddress;
    this.onlineRadio = onlineRadio;
    this.paymentMethodGroup = paymentMethodGroup;
    this.placeOrderButton = placeOrderButton;
    this.productImage = productImage;
    this.productName = productName;
    this.productPrice = productPrice;
    this.productQuantity = productQuantity;
    this.shippingAmount = shippingAmount;
    this.subtotalAmount = subtotalAmount;
    this.totalAmount = totalAmount;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityCheckoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityCheckoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_checkout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityCheckoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.backButton;
      ImageButton backButton = ViewBindings.findChildViewById(rootView, id);
      if (backButton == null) {
        break missingId;
      }

      id = R.id.codRadio;
      RadioButton codRadio = ViewBindings.findChildViewById(rootView, id);
      if (codRadio == null) {
        break missingId;
      }

      id = R.id.customerName;
      EditText customerName = ViewBindings.findChildViewById(rootView, id);
      if (customerName == null) {
        break missingId;
      }

      id = R.id.customerPhone;
      EditText customerPhone = ViewBindings.findChildViewById(rootView, id);
      if (customerPhone == null) {
        break missingId;
      }

      id = R.id.deliveryAddress;
      EditText deliveryAddress = ViewBindings.findChildViewById(rootView, id);
      if (deliveryAddress == null) {
        break missingId;
      }

      id = R.id.onlineRadio;
      RadioButton onlineRadio = ViewBindings.findChildViewById(rootView, id);
      if (onlineRadio == null) {
        break missingId;
      }

      id = R.id.paymentMethodGroup;
      RadioGroup paymentMethodGroup = ViewBindings.findChildViewById(rootView, id);
      if (paymentMethodGroup == null) {
        break missingId;
      }

      id = R.id.placeOrderButton;
      Button placeOrderButton = ViewBindings.findChildViewById(rootView, id);
      if (placeOrderButton == null) {
        break missingId;
      }

      id = R.id.productImage;
      ImageView productImage = ViewBindings.findChildViewById(rootView, id);
      if (productImage == null) {
        break missingId;
      }

      id = R.id.productName;
      TextView productName = ViewBindings.findChildViewById(rootView, id);
      if (productName == null) {
        break missingId;
      }

      id = R.id.productPrice;
      TextView productPrice = ViewBindings.findChildViewById(rootView, id);
      if (productPrice == null) {
        break missingId;
      }

      id = R.id.productQuantity;
      TextView productQuantity = ViewBindings.findChildViewById(rootView, id);
      if (productQuantity == null) {
        break missingId;
      }

      id = R.id.shippingAmount;
      TextView shippingAmount = ViewBindings.findChildViewById(rootView, id);
      if (shippingAmount == null) {
        break missingId;
      }

      id = R.id.subtotalAmount;
      TextView subtotalAmount = ViewBindings.findChildViewById(rootView, id);
      if (subtotalAmount == null) {
        break missingId;
      }

      id = R.id.totalAmount;
      TextView totalAmount = ViewBindings.findChildViewById(rootView, id);
      if (totalAmount == null) {
        break missingId;
      }

      return new ActivityCheckoutBinding((ScrollView) rootView, backButton, codRadio, customerName,
          customerPhone, deliveryAddress, onlineRadio, paymentMethodGroup, placeOrderButton,
          productImage, productName, productPrice, productQuantity, shippingAmount, subtotalAmount,
          totalAmount);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
