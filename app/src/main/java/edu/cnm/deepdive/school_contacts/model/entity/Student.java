package edu.cnm.deepdive.school_contacts.model.entity;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import java.time.LocalDate;

@Entity(
    indices = {
        @Index(value = {"last_name", "first_name", "middle_name"}, unique = true),
        @Index(value = {"student_number"}, unique = true)
    }
)
public class Student {

  @PrimaryKey(autoGenerate = true)
  @ColumnInfo(name = "student_id")
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
  private String middleName;

  @NonNull
  @ColumnInfo(index = true)
  private LocalDate enrolled = LocalDate.now();

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

  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  @NonNull
  public LocalDate getEnrolled() {
    return enrolled;
  }

  public LocalDate getDisenrolled() {
    return disenrolled;
  }

  public void setDisenrolled(LocalDate disenrolled) {
    this.disenrolled = disenrolled;
  }
}
