/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.metastore.api;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-8-3")
public class RolePrincipalGrant implements org.apache.thrift.TBase<RolePrincipalGrant, RolePrincipalGrant._Fields>, java.io.Serializable, Cloneable, Comparable<RolePrincipalGrant> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("RolePrincipalGrant");

  private static final org.apache.thrift.protocol.TField ROLE_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("roleName", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField PRINCIPAL_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("principalName", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField PRINCIPAL_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("principalType", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField GRANT_OPTION_FIELD_DESC = new org.apache.thrift.protocol.TField("grantOption", org.apache.thrift.protocol.TType.BOOL, (short)4);
  private static final org.apache.thrift.protocol.TField GRANT_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("grantTime", org.apache.thrift.protocol.TType.I32, (short)5);
  private static final org.apache.thrift.protocol.TField GRANTOR_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("grantorName", org.apache.thrift.protocol.TType.STRING, (short)6);
  private static final org.apache.thrift.protocol.TField GRANTOR_PRINCIPAL_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("grantorPrincipalType", org.apache.thrift.protocol.TType.I32, (short)7);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new RolePrincipalGrantStandardSchemeFactory());
    schemes.put(TupleScheme.class, new RolePrincipalGrantTupleSchemeFactory());
  }

  private String roleName; // required
  private String principalName; // required
  private PrincipalType principalType; // required
  private boolean grantOption; // required
  private int grantTime; // required
  private String grantorName; // required
  private PrincipalType grantorPrincipalType; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ROLE_NAME((short)1, "roleName"),
    PRINCIPAL_NAME((short)2, "principalName"),
    /**
     * 
     * @see PrincipalType
     */
    PRINCIPAL_TYPE((short)3, "principalType"),
    GRANT_OPTION((short)4, "grantOption"),
    GRANT_TIME((short)5, "grantTime"),
    GRANTOR_NAME((short)6, "grantorName"),
    /**
     * 
     * @see PrincipalType
     */
    GRANTOR_PRINCIPAL_TYPE((short)7, "grantorPrincipalType");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ROLE_NAME
          return ROLE_NAME;
        case 2: // PRINCIPAL_NAME
          return PRINCIPAL_NAME;
        case 3: // PRINCIPAL_TYPE
          return PRINCIPAL_TYPE;
        case 4: // GRANT_OPTION
          return GRANT_OPTION;
        case 5: // GRANT_TIME
          return GRANT_TIME;
        case 6: // GRANTOR_NAME
          return GRANTOR_NAME;
        case 7: // GRANTOR_PRINCIPAL_TYPE
          return GRANTOR_PRINCIPAL_TYPE;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __GRANTOPTION_ISSET_ID = 0;
  private static final int __GRANTTIME_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ROLE_NAME, new org.apache.thrift.meta_data.FieldMetaData("roleName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PRINCIPAL_NAME, new org.apache.thrift.meta_data.FieldMetaData("principalName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PRINCIPAL_TYPE, new org.apache.thrift.meta_data.FieldMetaData("principalType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, PrincipalType.class)));
    tmpMap.put(_Fields.GRANT_OPTION, new org.apache.thrift.meta_data.FieldMetaData("grantOption", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.GRANT_TIME, new org.apache.thrift.meta_data.FieldMetaData("grantTime", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.GRANTOR_NAME, new org.apache.thrift.meta_data.FieldMetaData("grantorName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.GRANTOR_PRINCIPAL_TYPE, new org.apache.thrift.meta_data.FieldMetaData("grantorPrincipalType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, PrincipalType.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(RolePrincipalGrant.class, metaDataMap);
  }

  public RolePrincipalGrant() {
  }

  public RolePrincipalGrant(
    String roleName,
    String principalName,
    PrincipalType principalType,
    boolean grantOption,
    int grantTime,
    String grantorName,
    PrincipalType grantorPrincipalType)
  {
    this();
    this.roleName = roleName;
    this.principalName = principalName;
    this.principalType = principalType;
    this.grantOption = grantOption;
    setGrantOptionIsSet(true);
    this.grantTime = grantTime;
    setGrantTimeIsSet(true);
    this.grantorName = grantorName;
    this.grantorPrincipalType = grantorPrincipalType;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public RolePrincipalGrant(RolePrincipalGrant other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetRoleName()) {
      this.roleName = other.roleName;
    }
    if (other.isSetPrincipalName()) {
      this.principalName = other.principalName;
    }
    if (other.isSetPrincipalType()) {
      this.principalType = other.principalType;
    }
    this.grantOption = other.grantOption;
    this.grantTime = other.grantTime;
    if (other.isSetGrantorName()) {
      this.grantorName = other.grantorName;
    }
    if (other.isSetGrantorPrincipalType()) {
      this.grantorPrincipalType = other.grantorPrincipalType;
    }
  }

  public RolePrincipalGrant deepCopy() {
    return new RolePrincipalGrant(this);
  }

  @Override
  public void clear() {
    this.roleName = null;
    this.principalName = null;
    this.principalType = null;
    setGrantOptionIsSet(false);
    this.grantOption = false;
    setGrantTimeIsSet(false);
    this.grantTime = 0;
    this.grantorName = null;
    this.grantorPrincipalType = null;
  }

  public String getRoleName() {
    return this.roleName;
  }

  public void setRoleName(String roleName) {
    this.roleName = roleName;
  }

  public void unsetRoleName() {
    this.roleName = null;
  }

  /** Returns true if field roleName is set (has been assigned a value) and false otherwise */
  public boolean isSetRoleName() {
    return this.roleName != null;
  }

  public void setRoleNameIsSet(boolean value) {
    if (!value) {
      this.roleName = null;
    }
  }

  public String getPrincipalName() {
    return this.principalName;
  }

  public void setPrincipalName(String principalName) {
    this.principalName = principalName;
  }

  public void unsetPrincipalName() {
    this.principalName = null;
  }

  /** Returns true if field principalName is set (has been assigned a value) and false otherwise */
  public boolean isSetPrincipalName() {
    return this.principalName != null;
  }

  public void setPrincipalNameIsSet(boolean value) {
    if (!value) {
      this.principalName = null;
    }
  }

  /**
   * 
   * @see PrincipalType
   */
  public PrincipalType getPrincipalType() {
    return this.principalType;
  }

  /**
   * 
   * @see PrincipalType
   */
  public void setPrincipalType(PrincipalType principalType) {
    this.principalType = principalType;
  }

  public void unsetPrincipalType() {
    this.principalType = null;
  }

  /** Returns true if field principalType is set (has been assigned a value) and false otherwise */
  public boolean isSetPrincipalType() {
    return this.principalType != null;
  }

  public void setPrincipalTypeIsSet(boolean value) {
    if (!value) {
      this.principalType = null;
    }
  }

  public boolean isGrantOption() {
    return this.grantOption;
  }

  public void setGrantOption(boolean grantOption) {
    this.grantOption = grantOption;
    setGrantOptionIsSet(true);
  }

  public void unsetGrantOption() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __GRANTOPTION_ISSET_ID);
  }

  /** Returns true if field grantOption is set (has been assigned a value) and false otherwise */
  public boolean isSetGrantOption() {
    return EncodingUtils.testBit(__isset_bitfield, __GRANTOPTION_ISSET_ID);
  }

  public void setGrantOptionIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __GRANTOPTION_ISSET_ID, value);
  }

  public int getGrantTime() {
    return this.grantTime;
  }

  public void setGrantTime(int grantTime) {
    this.grantTime = grantTime;
    setGrantTimeIsSet(true);
  }

  public void unsetGrantTime() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __GRANTTIME_ISSET_ID);
  }

  /** Returns true if field grantTime is set (has been assigned a value) and false otherwise */
  public boolean isSetGrantTime() {
    return EncodingUtils.testBit(__isset_bitfield, __GRANTTIME_ISSET_ID);
  }

  public void setGrantTimeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __GRANTTIME_ISSET_ID, value);
  }

  public String getGrantorName() {
    return this.grantorName;
  }

  public void setGrantorName(String grantorName) {
    this.grantorName = grantorName;
  }

  public void unsetGrantorName() {
    this.grantorName = null;
  }

  /** Returns true if field grantorName is set (has been assigned a value) and false otherwise */
  public boolean isSetGrantorName() {
    return this.grantorName != null;
  }

  public void setGrantorNameIsSet(boolean value) {
    if (!value) {
      this.grantorName = null;
    }
  }

  /**
   * 
   * @see PrincipalType
   */
  public PrincipalType getGrantorPrincipalType() {
    return this.grantorPrincipalType;
  }

  /**
   * 
   * @see PrincipalType
   */
  public void setGrantorPrincipalType(PrincipalType grantorPrincipalType) {
    this.grantorPrincipalType = grantorPrincipalType;
  }

  public void unsetGrantorPrincipalType() {
    this.grantorPrincipalType = null;
  }

  /** Returns true if field grantorPrincipalType is set (has been assigned a value) and false otherwise */
  public boolean isSetGrantorPrincipalType() {
    return this.grantorPrincipalType != null;
  }

  public void setGrantorPrincipalTypeIsSet(boolean value) {
    if (!value) {
      this.grantorPrincipalType = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ROLE_NAME:
      if (value == null) {
        unsetRoleName();
      } else {
        setRoleName((String)value);
      }
      break;

    case PRINCIPAL_NAME:
      if (value == null) {
        unsetPrincipalName();
      } else {
        setPrincipalName((String)value);
      }
      break;

    case PRINCIPAL_TYPE:
      if (value == null) {
        unsetPrincipalType();
      } else {
        setPrincipalType((PrincipalType)value);
      }
      break;

    case GRANT_OPTION:
      if (value == null) {
        unsetGrantOption();
      } else {
        setGrantOption((Boolean)value);
      }
      break;

    case GRANT_TIME:
      if (value == null) {
        unsetGrantTime();
      } else {
        setGrantTime((Integer)value);
      }
      break;

    case GRANTOR_NAME:
      if (value == null) {
        unsetGrantorName();
      } else {
        setGrantorName((String)value);
      }
      break;

    case GRANTOR_PRINCIPAL_TYPE:
      if (value == null) {
        unsetGrantorPrincipalType();
      } else {
        setGrantorPrincipalType((PrincipalType)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ROLE_NAME:
      return getRoleName();

    case PRINCIPAL_NAME:
      return getPrincipalName();

    case PRINCIPAL_TYPE:
      return getPrincipalType();

    case GRANT_OPTION:
      return Boolean.valueOf(isGrantOption());

    case GRANT_TIME:
      return Integer.valueOf(getGrantTime());

    case GRANTOR_NAME:
      return getGrantorName();

    case GRANTOR_PRINCIPAL_TYPE:
      return getGrantorPrincipalType();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ROLE_NAME:
      return isSetRoleName();
    case PRINCIPAL_NAME:
      return isSetPrincipalName();
    case PRINCIPAL_TYPE:
      return isSetPrincipalType();
    case GRANT_OPTION:
      return isSetGrantOption();
    case GRANT_TIME:
      return isSetGrantTime();
    case GRANTOR_NAME:
      return isSetGrantorName();
    case GRANTOR_PRINCIPAL_TYPE:
      return isSetGrantorPrincipalType();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof RolePrincipalGrant)
      return this.equals((RolePrincipalGrant)that);
    return false;
  }

  public boolean equals(RolePrincipalGrant that) {
    if (that == null)
      return false;

    boolean this_present_roleName = true && this.isSetRoleName();
    boolean that_present_roleName = true && that.isSetRoleName();
    if (this_present_roleName || that_present_roleName) {
      if (!(this_present_roleName && that_present_roleName))
        return false;
      if (!this.roleName.equals(that.roleName))
        return false;
    }

    boolean this_present_principalName = true && this.isSetPrincipalName();
    boolean that_present_principalName = true && that.isSetPrincipalName();
    if (this_present_principalName || that_present_principalName) {
      if (!(this_present_principalName && that_present_principalName))
        return false;
      if (!this.principalName.equals(that.principalName))
        return false;
    }

    boolean this_present_principalType = true && this.isSetPrincipalType();
    boolean that_present_principalType = true && that.isSetPrincipalType();
    if (this_present_principalType || that_present_principalType) {
      if (!(this_present_principalType && that_present_principalType))
        return false;
      if (!this.principalType.equals(that.principalType))
        return false;
    }

    boolean this_present_grantOption = true;
    boolean that_present_grantOption = true;
    if (this_present_grantOption || that_present_grantOption) {
      if (!(this_present_grantOption && that_present_grantOption))
        return false;
      if (this.grantOption != that.grantOption)
        return false;
    }

    boolean this_present_grantTime = true;
    boolean that_present_grantTime = true;
    if (this_present_grantTime || that_present_grantTime) {
      if (!(this_present_grantTime && that_present_grantTime))
        return false;
      if (this.grantTime != that.grantTime)
        return false;
    }

    boolean this_present_grantorName = true && this.isSetGrantorName();
    boolean that_present_grantorName = true && that.isSetGrantorName();
    if (this_present_grantorName || that_present_grantorName) {
      if (!(this_present_grantorName && that_present_grantorName))
        return false;
      if (!this.grantorName.equals(that.grantorName))
        return false;
    }

    boolean this_present_grantorPrincipalType = true && this.isSetGrantorPrincipalType();
    boolean that_present_grantorPrincipalType = true && that.isSetGrantorPrincipalType();
    if (this_present_grantorPrincipalType || that_present_grantorPrincipalType) {
      if (!(this_present_grantorPrincipalType && that_present_grantorPrincipalType))
        return false;
      if (!this.grantorPrincipalType.equals(that.grantorPrincipalType))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_roleName = true && (isSetRoleName());
    list.add(present_roleName);
    if (present_roleName)
      list.add(roleName);

    boolean present_principalName = true && (isSetPrincipalName());
    list.add(present_principalName);
    if (present_principalName)
      list.add(principalName);

    boolean present_principalType = true && (isSetPrincipalType());
    list.add(present_principalType);
    if (present_principalType)
      list.add(principalType.getValue());

    boolean present_grantOption = true;
    list.add(present_grantOption);
    if (present_grantOption)
      list.add(grantOption);

    boolean present_grantTime = true;
    list.add(present_grantTime);
    if (present_grantTime)
      list.add(grantTime);

    boolean present_grantorName = true && (isSetGrantorName());
    list.add(present_grantorName);
    if (present_grantorName)
      list.add(grantorName);

    boolean present_grantorPrincipalType = true && (isSetGrantorPrincipalType());
    list.add(present_grantorPrincipalType);
    if (present_grantorPrincipalType)
      list.add(grantorPrincipalType.getValue());

    return list.hashCode();
  }

  @Override
  public int compareTo(RolePrincipalGrant other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetRoleName()).compareTo(other.isSetRoleName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRoleName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.roleName, other.roleName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPrincipalName()).compareTo(other.isSetPrincipalName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPrincipalName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.principalName, other.principalName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPrincipalType()).compareTo(other.isSetPrincipalType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPrincipalType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.principalType, other.principalType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetGrantOption()).compareTo(other.isSetGrantOption());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGrantOption()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.grantOption, other.grantOption);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetGrantTime()).compareTo(other.isSetGrantTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGrantTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.grantTime, other.grantTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetGrantorName()).compareTo(other.isSetGrantorName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGrantorName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.grantorName, other.grantorName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetGrantorPrincipalType()).compareTo(other.isSetGrantorPrincipalType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGrantorPrincipalType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.grantorPrincipalType, other.grantorPrincipalType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("RolePrincipalGrant(");
    boolean first = true;

    sb.append("roleName:");
    if (this.roleName == null) {
      sb.append("null");
    } else {
      sb.append(this.roleName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("principalName:");
    if (this.principalName == null) {
      sb.append("null");
    } else {
      sb.append(this.principalName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("principalType:");
    if (this.principalType == null) {
      sb.append("null");
    } else {
      sb.append(this.principalType);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("grantOption:");
    sb.append(this.grantOption);
    first = false;
    if (!first) sb.append(", ");
    sb.append("grantTime:");
    sb.append(this.grantTime);
    first = false;
    if (!first) sb.append(", ");
    sb.append("grantorName:");
    if (this.grantorName == null) {
      sb.append("null");
    } else {
      sb.append(this.grantorName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("grantorPrincipalType:");
    if (this.grantorPrincipalType == null) {
      sb.append("null");
    } else {
      sb.append(this.grantorPrincipalType);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class RolePrincipalGrantStandardSchemeFactory implements SchemeFactory {
    public RolePrincipalGrantStandardScheme getScheme() {
      return new RolePrincipalGrantStandardScheme();
    }
  }

  private static class RolePrincipalGrantStandardScheme extends StandardScheme<RolePrincipalGrant> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, RolePrincipalGrant struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ROLE_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.roleName = iprot.readString();
              struct.setRoleNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // PRINCIPAL_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.principalName = iprot.readString();
              struct.setPrincipalNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PRINCIPAL_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.principalType = org.apache.hadoop.hive.metastore.api.PrincipalType.findByValue(iprot.readI32());
              struct.setPrincipalTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // GRANT_OPTION
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.grantOption = iprot.readBool();
              struct.setGrantOptionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // GRANT_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.grantTime = iprot.readI32();
              struct.setGrantTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // GRANTOR_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.grantorName = iprot.readString();
              struct.setGrantorNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // GRANTOR_PRINCIPAL_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.grantorPrincipalType = org.apache.hadoop.hive.metastore.api.PrincipalType.findByValue(iprot.readI32());
              struct.setGrantorPrincipalTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, RolePrincipalGrant struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.roleName != null) {
        oprot.writeFieldBegin(ROLE_NAME_FIELD_DESC);
        oprot.writeString(struct.roleName);
        oprot.writeFieldEnd();
      }
      if (struct.principalName != null) {
        oprot.writeFieldBegin(PRINCIPAL_NAME_FIELD_DESC);
        oprot.writeString(struct.principalName);
        oprot.writeFieldEnd();
      }
      if (struct.principalType != null) {
        oprot.writeFieldBegin(PRINCIPAL_TYPE_FIELD_DESC);
        oprot.writeI32(struct.principalType.getValue());
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(GRANT_OPTION_FIELD_DESC);
      oprot.writeBool(struct.grantOption);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(GRANT_TIME_FIELD_DESC);
      oprot.writeI32(struct.grantTime);
      oprot.writeFieldEnd();
      if (struct.grantorName != null) {
        oprot.writeFieldBegin(GRANTOR_NAME_FIELD_DESC);
        oprot.writeString(struct.grantorName);
        oprot.writeFieldEnd();
      }
      if (struct.grantorPrincipalType != null) {
        oprot.writeFieldBegin(GRANTOR_PRINCIPAL_TYPE_FIELD_DESC);
        oprot.writeI32(struct.grantorPrincipalType.getValue());
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class RolePrincipalGrantTupleSchemeFactory implements SchemeFactory {
    public RolePrincipalGrantTupleScheme getScheme() {
      return new RolePrincipalGrantTupleScheme();
    }
  }

  private static class RolePrincipalGrantTupleScheme extends TupleScheme<RolePrincipalGrant> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, RolePrincipalGrant struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetRoleName()) {
        optionals.set(0);
      }
      if (struct.isSetPrincipalName()) {
        optionals.set(1);
      }
      if (struct.isSetPrincipalType()) {
        optionals.set(2);
      }
      if (struct.isSetGrantOption()) {
        optionals.set(3);
      }
      if (struct.isSetGrantTime()) {
        optionals.set(4);
      }
      if (struct.isSetGrantorName()) {
        optionals.set(5);
      }
      if (struct.isSetGrantorPrincipalType()) {
        optionals.set(6);
      }
      oprot.writeBitSet(optionals, 7);
      if (struct.isSetRoleName()) {
        oprot.writeString(struct.roleName);
      }
      if (struct.isSetPrincipalName()) {
        oprot.writeString(struct.principalName);
      }
      if (struct.isSetPrincipalType()) {
        oprot.writeI32(struct.principalType.getValue());
      }
      if (struct.isSetGrantOption()) {
        oprot.writeBool(struct.grantOption);
      }
      if (struct.isSetGrantTime()) {
        oprot.writeI32(struct.grantTime);
      }
      if (struct.isSetGrantorName()) {
        oprot.writeString(struct.grantorName);
      }
      if (struct.isSetGrantorPrincipalType()) {
        oprot.writeI32(struct.grantorPrincipalType.getValue());
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, RolePrincipalGrant struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(7);
      if (incoming.get(0)) {
        struct.roleName = iprot.readString();
        struct.setRoleNameIsSet(true);
      }
      if (incoming.get(1)) {
        struct.principalName = iprot.readString();
        struct.setPrincipalNameIsSet(true);
      }
      if (incoming.get(2)) {
        struct.principalType = org.apache.hadoop.hive.metastore.api.PrincipalType.findByValue(iprot.readI32());
        struct.setPrincipalTypeIsSet(true);
      }
      if (incoming.get(3)) {
        struct.grantOption = iprot.readBool();
        struct.setGrantOptionIsSet(true);
      }
      if (incoming.get(4)) {
        struct.grantTime = iprot.readI32();
        struct.setGrantTimeIsSet(true);
      }
      if (incoming.get(5)) {
        struct.grantorName = iprot.readString();
        struct.setGrantorNameIsSet(true);
      }
      if (incoming.get(6)) {
        struct.grantorPrincipalType = org.apache.hadoop.hive.metastore.api.PrincipalType.findByValue(iprot.readI32());
        struct.setGrantorPrincipalTypeIsSet(true);
      }
    }
  }

}

