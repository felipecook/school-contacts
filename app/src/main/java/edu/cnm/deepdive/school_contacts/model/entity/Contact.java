package edu.cnm.deepdive.school_contacts.model.entity;

import androidx.annotation.Nullable;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Contact {

  @PrimaryKey(autoGenerate = true)
  @ColumnInfo(name = "contact_id")
  private long contactId;

  @ColumnInfo(name = "last_name")
  private String lastName;

  @ColumnInfo(name = "first_name")
  private String firstName;

  @Nullable
  @ColumnInfo(name = "middle_name")
  private String middleName;

  @ColumnInfo(name = "phone_number")
  private String phoneNumber;

  @Nullable
  @ColumnInfo(name = "sms_number")
  private String smsNumber;

  @Nullable
  @ColumnInfo(name = "email")
  private String email;

  public long getContactId() {
    return contactId;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  @Nullable
  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(@Nullable String middleName) {
    this.middleName = middleName;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  @Nullable
  public String getSmsNumber() {
    return smsNumber;
  }

  public void setSmsNumber(@Nullable String smsNumber) {
    this.smsNumber = smsNumber;
  }

  @Nullable
  public String getEmail() {
    return email;
  }

  public void setEmail(@Nullable String email) {
    this.email = email;
  }
}
