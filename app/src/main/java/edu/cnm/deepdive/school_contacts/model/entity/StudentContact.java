package edu.cnm.deepdive.school_contacts.model.entity;


import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;
import androidx.room.PrimaryKey;

@Entity(
    indices = {
        @Index(value = {"student_id", "contact_id"}, unique = true)
    },
    foreignKeys = {
        @ForeignKey(entity = Student.class, parentColumns = {"student_id"}, childColumns = {"student_id"},
            onDelete = ForeignKey.CASCADE),
        @ForeignKey(entity = Contact.class, parentColumns = {"contact_id"}, childColumns = {"contact_id"},
        onDelete = ForeignKey.CASCADE)
    }
)
public class StudentContact {

  @PrimaryKey(autoGenerate = true)
  @ColumnInfo(name = "student_contact_id")
  private long studentContactId;

  @ColumnInfo(name = "student_id", index = true)
  private long studentId;

  @ColumnInfo(name = "contact_id", index = true)
  private long contactId;

  private boolean primary;

  @NonNull
  @ColumnInfo(name = "relationship_type", index = true)
  private RelationshipType relationshipType;

  private enum RelationshipType {PARENT, GUARDIAN, SIBLING, OTHER};

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
}
