package edu.cnm.deepdive.school_contacts.model.entity;


import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class StudentContact {

  @PrimaryKey
  @ColumnInfo(name = "student_contact_id")
  @NonNull
  private long studentContactId;

  @ColumnInfo(name = "student_id")
  private long studentId;

  @NonNull
  @ColumnInfo(name = "contact_id")
  private long contactId;

  @NonNull
  private boolean primary;

  public long getStudentContactId() {
    return studentContactId;
  }

  public long getStudentId() {
    return studentId;
  }

  public long getContactId() {
    return contactId;
  }

  public boolean isPrimary() {
    return primary;
  }

  public void setPrimary(boolean primary) {
    this.primary = primary;
  }

  private enum relationshipType {PARENT, GUARDIAN, SIBLING, OTHER};
}
