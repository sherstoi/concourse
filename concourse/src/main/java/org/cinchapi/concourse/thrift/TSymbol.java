/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 * 
 * @generated
 */
package org.cinchapi.concourse.thrift;

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

@SuppressWarnings({ "cast", "rawtypes", "serial", "unchecked", "unused" })
/**
 * A representation for a Symbol that can be passed over the wire via
 * Thrift. Once passed over the wire, the server uses information
 * about the symbol type to parse the string representation of the
 * symbol to an actual object.
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-2-22")
public class TSymbol implements
        org.apache.thrift.TBase<TSymbol, TSymbol._Fields>,
        java.io.Serializable,
        Cloneable,
        Comparable<TSymbol> {
    // isset id assignments
    public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;

    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct(
            "TSymbol");

    private static final org.apache.thrift.protocol.TField SYMBOL_FIELD_DESC = new org.apache.thrift.protocol.TField(
            "symbol", org.apache.thrift.protocol.TType.STRING, (short) 2);
    private static final org.apache.thrift.protocol.TField TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField(
            "type", org.apache.thrift.protocol.TType.I32, (short) 1);

    static {
        schemes.put(StandardScheme.class, new TSymbolStandardSchemeFactory());
        schemes.put(TupleScheme.class, new TSymbolTupleSchemeFactory());
    }
    static {
        Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(
                _Fields.class);
        tmpMap.put(_Fields.TYPE, new org.apache.thrift.meta_data.FieldMetaData(
                "type", org.apache.thrift.TFieldRequirementType.REQUIRED,
                new org.apache.thrift.meta_data.EnumMetaData(
                        org.apache.thrift.protocol.TType.ENUM,
                        TSymbolType.class)));
        tmpMap.put(_Fields.SYMBOL,
                new org.apache.thrift.meta_data.FieldMetaData("symbol",
                        org.apache.thrift.TFieldRequirementType.REQUIRED,
                        new org.apache.thrift.meta_data.FieldValueMetaData(
                                org.apache.thrift.protocol.TType.STRING)));
        metaDataMap = Collections.unmodifiableMap(tmpMap);
        org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(
                TSymbol.class, metaDataMap);
    }

    public String symbol; // required

    /**
     * 
     * @see TSymbolType
     */
    public TSymbolType type; // required
    public TSymbol() {}

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public TSymbol(TSymbol other) {
        if(other.isSetType()) {
            this.type = other.type;
        }
        if(other.isSetSymbol()) {
            this.symbol = other.symbol;
        }
    }

    public TSymbol(TSymbolType type, String symbol) {
        this();
        this.type = type;
        this.symbol = symbol;
    }

    @Override
    public void clear() {
        this.type = null;
        this.symbol = null;
    }

    @Override
    public int compareTo(TSymbol other) {
        if(!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }

        int lastComparison = 0;

        lastComparison = Boolean.valueOf(isSetType()).compareTo(
                other.isSetType());
        if(lastComparison != 0) {
            return lastComparison;
        }
        if(isSetType()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.type,
                    other.type);
            if(lastComparison != 0) {
                return lastComparison;
            }
        }
        lastComparison = Boolean.valueOf(isSetSymbol()).compareTo(
                other.isSetSymbol());
        if(lastComparison != 0) {
            return lastComparison;
        }
        if(isSetSymbol()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(
                    this.symbol, other.symbol);
            if(lastComparison != 0) {
                return lastComparison;
            }
        }
        return 0;
    }

    public TSymbol deepCopy() {
        return new TSymbol(this);
    }

    @Override
    public boolean equals(Object that) {
        if(that == null)
            return false;
        if(that instanceof TSymbol)
            return this.equals((TSymbol) that);
        return false;
    }

    public boolean equals(TSymbol that) {
        if(that == null)
            return false;

        boolean this_present_type = true && this.isSetType();
        boolean that_present_type = true && that.isSetType();
        if(this_present_type || that_present_type) {
            if(!(this_present_type && that_present_type))
                return false;
            if(!this.type.equals(that.type))
                return false;
        }

        boolean this_present_symbol = true && this.isSetSymbol();
        boolean that_present_symbol = true && that.isSetSymbol();
        if(this_present_symbol || that_present_symbol) {
            if(!(this_present_symbol && that_present_symbol))
                return false;
            if(!this.symbol.equals(that.symbol))
                return false;
        }

        return true;
    }

    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    public Object getFieldValue(_Fields field) {
        switch (field) {
        case TYPE:
            return getType();

        case SYMBOL:
            return getSymbol();

        }
        throw new IllegalStateException();
    }

    public String getSymbol() {
        return this.symbol;
    }

    /**
     * 
     * @see TSymbolType
     */
    public TSymbolType getType() {
        return this.type;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    /**
     * Returns true if field corresponding to fieldID is set (has been assigned
     * a value) and false otherwise
     */
    public boolean isSet(_Fields field) {
        if(field == null) {
            throw new IllegalArgumentException();
        }

        switch (field) {
        case TYPE:
            return isSetType();
        case SYMBOL:
            return isSetSymbol();
        }
        throw new IllegalStateException();
    }

    /**
     * Returns true if field symbol is set (has been assigned a value) and false
     * otherwise
     */
    public boolean isSetSymbol() {
        return this.symbol != null;
    }

    /**
     * Returns true if field type is set (has been assigned a value) and false
     * otherwise
     */
    public boolean isSetType() {
        return this.type != null;
    }

    public void read(org.apache.thrift.protocol.TProtocol iprot)
            throws org.apache.thrift.TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public void setFieldValue(_Fields field, Object value) {
        switch (field) {
        case TYPE:
            if(value == null) {
                unsetType();
            }
            else {
                setType((TSymbolType) value);
            }
            break;

        case SYMBOL:
            if(value == null) {
                unsetSymbol();
            }
            else {
                setSymbol((String) value);
            }
            break;

        }
    }

    public TSymbol setSymbol(String symbol) {
        this.symbol = symbol;
        return this;
    }

    public void setSymbolIsSet(boolean value) {
        if(!value) {
            this.symbol = null;
        }
    }

    /**
     * 
     * @see TSymbolType
     */
    public TSymbol setType(TSymbolType type) {
        this.type = type;
        return this;
    }

    public void setTypeIsSet(boolean value) {
        if(!value) {
            this.type = null;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TSymbol(");
        boolean first = true;

        sb.append("type:");
        if(this.type == null) {
            sb.append("null");
        }
        else {
            sb.append(this.type);
        }
        first = false;
        if(!first)
            sb.append(", ");
        sb.append("symbol:");
        if(this.symbol == null) {
            sb.append("null");
        }
        else {
            sb.append(this.symbol);
        }
        first = false;
        sb.append(")");
        return sb.toString();
    }

    public void unsetSymbol() {
        this.symbol = null;
    }

    public void unsetType() {
        this.type = null;
    }

    public void validate() throws org.apache.thrift.TException {
        // check for required fields
        if(type == null) {
            throw new org.apache.thrift.protocol.TProtocolException(
                    "Required field 'type' was not present! Struct: "
                            + toString());
        }
        if(symbol == null) {
            throw new org.apache.thrift.protocol.TProtocolException(
                    "Required field 'symbol' was not present! Struct: "
                            + toString());
        }
        // check for sub-struct validity
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot)
            throws org.apache.thrift.TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    private void readObject(java.io.ObjectInputStream in)
            throws java.io.IOException, ClassNotFoundException {
        try {
            read(new org.apache.thrift.protocol.TCompactProtocol(
                    new org.apache.thrift.transport.TIOStreamTransport(in)));
        }
        catch (org.apache.thrift.TException te) {
            throw new java.io.IOException(te);
        }
    }

    private void writeObject(java.io.ObjectOutputStream out)
            throws java.io.IOException {
        try {
            write(new org.apache.thrift.protocol.TCompactProtocol(
                    new org.apache.thrift.transport.TIOStreamTransport(out)));
        }
        catch (org.apache.thrift.TException te) {
            throw new java.io.IOException(te);
        }
    }

    /**
     * The set of fields this struct contains, along with convenience methods
     * for finding and manipulating them.
     */
    public enum _Fields implements org.apache.thrift.TFieldIdEnum {
        SYMBOL((short) 2, "symbol"), /**
         * 
         * @see TSymbolType
         */
        TYPE((short) 1, "type");

        /**
         * Find the _Fields constant that matches name, or null if its not
         * found.
         */
        public static _Fields findByName(String name) {
            return byName.get(name);
        }

        /**
         * Find the _Fields constant that matches fieldId, or null if its not
         * found.
         */
        public static _Fields findByThriftId(int fieldId) {
            switch (fieldId) {
            case 1: // TYPE
                return TYPE;
            case 2: // SYMBOL
                return SYMBOL;
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
            if(fields == null)
                throw new IllegalArgumentException("Field " + fieldId
                        + " doesn't exist!");
            return fields;
        }

        private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

        static {
            for (_Fields field : EnumSet.allOf(_Fields.class)) {
                byName.put(field.getFieldName(), field);
            }
        }

        private final String _fieldName;
        private final short _thriftId;

        _Fields(short thriftId, String fieldName) {
            _thriftId = thriftId;
            _fieldName = fieldName;
        }

        public String getFieldName() {
            return _fieldName;
        }

        public short getThriftFieldId() {
            return _thriftId;
        }
    }

    private static class TSymbolStandardScheme extends StandardScheme<TSymbol> {

        public void read(org.apache.thrift.protocol.TProtocol iprot,
                TSymbol struct) throws org.apache.thrift.TException {
            org.apache.thrift.protocol.TField schemeField;
            iprot.readStructBegin();
            while (true) {
                schemeField = iprot.readFieldBegin();
                if(schemeField.type == org.apache.thrift.protocol.TType.STOP) {
                    break;
                }
                switch (schemeField.id) {
                case 1: // TYPE
                    if(schemeField.type == org.apache.thrift.protocol.TType.I32) {
                        struct.type = org.cinchapi.concourse.thrift.TSymbolType
                                .findByValue(iprot.readI32());
                        struct.setTypeIsSet(true);
                    }
                    else {
                        org.apache.thrift.protocol.TProtocolUtil.skip(iprot,
                                schemeField.type);
                    }
                    break;
                case 2: // SYMBOL
                    if(schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                        struct.symbol = iprot.readString();
                        struct.setSymbolIsSet(true);
                    }
                    else {
                        org.apache.thrift.protocol.TProtocolUtil.skip(iprot,
                                schemeField.type);
                    }
                    break;
                default:
                    org.apache.thrift.protocol.TProtocolUtil.skip(iprot,
                            schemeField.type);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();

            // check for required fields of primitive type, which can't be
            // checked in the validate method
            struct.validate();
        }

        public void write(org.apache.thrift.protocol.TProtocol oprot,
                TSymbol struct) throws org.apache.thrift.TException {
            struct.validate();

            oprot.writeStructBegin(STRUCT_DESC);
            if(struct.type != null) {
                oprot.writeFieldBegin(TYPE_FIELD_DESC);
                oprot.writeI32(struct.type.getValue());
                oprot.writeFieldEnd();
            }
            if(struct.symbol != null) {
                oprot.writeFieldBegin(SYMBOL_FIELD_DESC);
                oprot.writeString(struct.symbol);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }

    }

    private static class TSymbolStandardSchemeFactory implements SchemeFactory {
        public TSymbolStandardScheme getScheme() {
            return new TSymbolStandardScheme();
        }
    }

    private static class TSymbolTupleScheme extends TupleScheme<TSymbol> {

        @Override
        public void read(org.apache.thrift.protocol.TProtocol prot,
                TSymbol struct) throws org.apache.thrift.TException {
            TTupleProtocol iprot = (TTupleProtocol) prot;
            struct.type = org.cinchapi.concourse.thrift.TSymbolType
                    .findByValue(iprot.readI32());
            struct.setTypeIsSet(true);
            struct.symbol = iprot.readString();
            struct.setSymbolIsSet(true);
        }

        @Override
        public void write(org.apache.thrift.protocol.TProtocol prot,
                TSymbol struct) throws org.apache.thrift.TException {
            TTupleProtocol oprot = (TTupleProtocol) prot;
            oprot.writeI32(struct.type.getValue());
            oprot.writeString(struct.symbol);
        }
    }

    private static class TSymbolTupleSchemeFactory implements SchemeFactory {
        public TSymbolTupleScheme getScheme() {
            return new TSymbolTupleScheme();
        }
    }

}
