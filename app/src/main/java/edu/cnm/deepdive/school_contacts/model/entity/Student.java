package edu.cnm.deepdive.school_contacts.model.entity;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import java.time.LocalDate;

@Entity
public class Student {

  @PrimaryKey
  @ColumnInfo(name = "student_id")
  @NonNull
  private long studentId;

  @ColumnInfo(name = "student_number")
  @NonNull
  private String studentNumber;

  @ColumnInfo(name = "last_name")
  @NonNull
  private String lastName;

  @ColumnInfo(name = "first_name")
  @NonNull
  private String firstName;

  @ColumnInfo(name = "middle_name")
  @Nullable
  private String middleName;

  @NonNull
  @ColumnInfo(index = true)
  private LocalDate enrolled;

  @Nullable
  @ColumnInfo(index = true)
  private LocalDate disenrolled;

  public long getStudentId() {
    return studentId;
  }

  @NonNull
  public String getStudentNumber() {
    return studentNumber;
  }

  public void setStudentNumber(@NonNull String studentNumber) {
    this.studentNumber = studentNumber;
  }

  @NonNull
  public String getLastName() {
    return lastName;
  }

  public void setLastName(@NonNull String lastName) {
    this.lastName = lastName;
  }

  @NonNull
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(@NonNull String firstName) {
    this.firstName = firstName;
  }

  @Nullable
  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(@Nullable String middleName) {
    this.middleName = middleName;
  }

  @NonNull
  public LocalDate getEnrolled() {
    return enrolled;
  }

  public void setEnrolled(@NonNull LocalDate enrolled) {
    this.enrolled = enrolled;
  }

  @Nullable
  public LocalDate getDisenrolled() {
    return disenrolled;
  }

  public void setDisenrolled(@Nullable LocalDate disenrolled) {
    this.disenrolled = disenrolled;
  }
}
