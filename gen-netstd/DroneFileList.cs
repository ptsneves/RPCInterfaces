/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
using System;
using System.Collections;
using System.Collections.Generic;
using System.Text;
using System.IO;
using System.Threading;
using System.Threading.Tasks;
using Thrift;
using Thrift.Collections;

using Thrift.Protocol;
using Thrift.Protocol.Entities;
using Thrift.Protocol.Utilities;
using Thrift.Transport;
using Thrift.Transport.Client;
using Thrift.Transport.Server;
using Thrift.Processor;



public partial class DroneFileList : TBase
{
  private List<FileEntry> _file_entries;
  private string _serial;
  private long _timestamp;

  public List<FileEntry> FileEntries
  {
    get
    {
      return _file_entries;
    }
    set
    {
      __isset.file_entries = true;
      this._file_entries = value;
    }
  }

  public string Serial
  {
    get
    {
      return _serial;
    }
    set
    {
      __isset.serial = true;
      this._serial = value;
    }
  }

  public long Timestamp
  {
    get
    {
      return _timestamp;
    }
    set
    {
      __isset.timestamp = true;
      this._timestamp = value;
    }
  }


  public Isset __isset;
  public struct Isset
  {
    public bool file_entries;
    public bool serial;
    public bool timestamp;
  }

  public DroneFileList()
  {
  }

  public async Task ReadAsync(TProtocol iprot, CancellationToken cancellationToken)
  {
    iprot.IncrementRecursionDepth();
    try
    {
      TField field;
      await iprot.ReadStructBeginAsync(cancellationToken);
      while (true)
      {
        field = await iprot.ReadFieldBeginAsync(cancellationToken);
        if (field.Type == TType.Stop)
        {
          break;
        }

        switch (field.ID)
        {
          case 1:
            if (field.Type == TType.List)
            {
              {
                TList _list0 = await iprot.ReadListBeginAsync(cancellationToken);
                FileEntries = new List<FileEntry>(_list0.Count);
                for(int _i1 = 0; _i1 < _list0.Count; ++_i1)
                {
                  FileEntry _elem2;
                  _elem2 = new FileEntry();
                  await _elem2.ReadAsync(iprot, cancellationToken);
                  FileEntries.Add(_elem2);
                }
                await iprot.ReadListEndAsync(cancellationToken);
              }
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 2:
            if (field.Type == TType.String)
            {
              Serial = await iprot.ReadStringAsync(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 3:
            if (field.Type == TType.I64)
            {
              Timestamp = await iprot.ReadI64Async(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          default: 
            await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            break;
        }

        await iprot.ReadFieldEndAsync(cancellationToken);
      }

      await iprot.ReadStructEndAsync(cancellationToken);
    }
    finally
    {
      iprot.DecrementRecursionDepth();
    }
  }

  public async Task WriteAsync(TProtocol oprot, CancellationToken cancellationToken)
  {
    oprot.IncrementRecursionDepth();
    try
    {
      var struc = new TStruct("DroneFileList");
      await oprot.WriteStructBeginAsync(struc, cancellationToken);
      var field = new TField();
      if (FileEntries != null && __isset.file_entries)
      {
        field.Name = "file_entries";
        field.Type = TType.List;
        field.ID = 1;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        {
          await oprot.WriteListBeginAsync(new TList(TType.Struct, FileEntries.Count), cancellationToken);
          foreach (FileEntry _iter3 in FileEntries)
          {
            await _iter3.WriteAsync(oprot, cancellationToken);
          }
          await oprot.WriteListEndAsync(cancellationToken);
        }
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (Serial != null && __isset.serial)
      {
        field.Name = "serial";
        field.Type = TType.String;
        field.ID = 2;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteStringAsync(Serial, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (__isset.timestamp)
      {
        field.Name = "timestamp";
        field.Type = TType.I64;
        field.ID = 3;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteI64Async(Timestamp, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      await oprot.WriteFieldStopAsync(cancellationToken);
      await oprot.WriteStructEndAsync(cancellationToken);
    }
    finally
    {
      oprot.DecrementRecursionDepth();
    }
  }

  public override bool Equals(object that)
  {
    var other = that as DroneFileList;
    if (other == null) return false;
    if (ReferenceEquals(this, other)) return true;
    return ((__isset.file_entries == other.__isset.file_entries) && ((!__isset.file_entries) || (TCollections.Equals(FileEntries, other.FileEntries))))
      && ((__isset.serial == other.__isset.serial) && ((!__isset.serial) || (System.Object.Equals(Serial, other.Serial))))
      && ((__isset.timestamp == other.__isset.timestamp) && ((!__isset.timestamp) || (System.Object.Equals(Timestamp, other.Timestamp))));
  }

  public override int GetHashCode() {
    int hashcode = 157;
    unchecked {
      if(__isset.file_entries)
        hashcode = (hashcode * 397) + TCollections.GetHashCode(FileEntries);
      if(__isset.serial)
        hashcode = (hashcode * 397) + Serial.GetHashCode();
      if(__isset.timestamp)
        hashcode = (hashcode * 397) + Timestamp.GetHashCode();
    }
    return hashcode;
  }

  public override string ToString()
  {
    var sb = new StringBuilder("DroneFileList(");
    bool __first = true;
    if (FileEntries != null && __isset.file_entries)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("FileEntries: ");
      sb.Append(FileEntries);
    }
    if (Serial != null && __isset.serial)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("Serial: ");
      sb.Append(Serial);
    }
    if (__isset.timestamp)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("Timestamp: ");
      sb.Append(Timestamp);
    }
    sb.Append(")");
    return sb.ToString();
  }
}

