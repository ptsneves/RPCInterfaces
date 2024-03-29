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



public partial class CameraState : TBase
{
  private CameraMode _mode;
  private double _zoom_level;
  private double _min_zoom;
  private double _max_zoom;
  private string _serial;
  private long _timestamp;

  public CameraMode Mode
  {
    get
    {
      return _mode;
    }
    set
    {
      __isset.mode = true;
      this._mode = value;
    }
  }

  public double ZoomLevel
  {
    get
    {
      return _zoom_level;
    }
    set
    {
      __isset.zoom_level = true;
      this._zoom_level = value;
    }
  }

  public double MinZoom
  {
    get
    {
      return _min_zoom;
    }
    set
    {
      __isset.min_zoom = true;
      this._min_zoom = value;
    }
  }

  public double MaxZoom
  {
    get
    {
      return _max_zoom;
    }
    set
    {
      __isset.max_zoom = true;
      this._max_zoom = value;
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
    public bool mode;
    public bool zoom_level;
    public bool min_zoom;
    public bool max_zoom;
    public bool serial;
    public bool timestamp;
  }

  public CameraState()
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
            if (field.Type == TType.I32)
            {
              Mode = (CameraMode)await iprot.ReadI32Async(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 2:
            if (field.Type == TType.Double)
            {
              ZoomLevel = await iprot.ReadDoubleAsync(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 3:
            if (field.Type == TType.Double)
            {
              MinZoom = await iprot.ReadDoubleAsync(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 4:
            if (field.Type == TType.Double)
            {
              MaxZoom = await iprot.ReadDoubleAsync(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 5:
            if (field.Type == TType.String)
            {
              Serial = await iprot.ReadStringAsync(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 6:
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
      var struc = new TStruct("CameraState");
      await oprot.WriteStructBeginAsync(struc, cancellationToken);
      var field = new TField();
      if (__isset.mode)
      {
        field.Name = "mode";
        field.Type = TType.I32;
        field.ID = 1;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteI32Async((int)Mode, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (__isset.zoom_level)
      {
        field.Name = "zoom_level";
        field.Type = TType.Double;
        field.ID = 2;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteDoubleAsync(ZoomLevel, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (__isset.min_zoom)
      {
        field.Name = "min_zoom";
        field.Type = TType.Double;
        field.ID = 3;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteDoubleAsync(MinZoom, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (__isset.max_zoom)
      {
        field.Name = "max_zoom";
        field.Type = TType.Double;
        field.ID = 4;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteDoubleAsync(MaxZoom, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (Serial != null && __isset.serial)
      {
        field.Name = "serial";
        field.Type = TType.String;
        field.ID = 5;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteStringAsync(Serial, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (__isset.timestamp)
      {
        field.Name = "timestamp";
        field.Type = TType.I64;
        field.ID = 6;
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
    var other = that as CameraState;
    if (other == null) return false;
    if (ReferenceEquals(this, other)) return true;
    return ((__isset.mode == other.__isset.mode) && ((!__isset.mode) || (System.Object.Equals(Mode, other.Mode))))
      && ((__isset.zoom_level == other.__isset.zoom_level) && ((!__isset.zoom_level) || (System.Object.Equals(ZoomLevel, other.ZoomLevel))))
      && ((__isset.min_zoom == other.__isset.min_zoom) && ((!__isset.min_zoom) || (System.Object.Equals(MinZoom, other.MinZoom))))
      && ((__isset.max_zoom == other.__isset.max_zoom) && ((!__isset.max_zoom) || (System.Object.Equals(MaxZoom, other.MaxZoom))))
      && ((__isset.serial == other.__isset.serial) && ((!__isset.serial) || (System.Object.Equals(Serial, other.Serial))))
      && ((__isset.timestamp == other.__isset.timestamp) && ((!__isset.timestamp) || (System.Object.Equals(Timestamp, other.Timestamp))));
  }

  public override int GetHashCode() {
    int hashcode = 157;
    unchecked {
      if(__isset.mode)
        hashcode = (hashcode * 397) + Mode.GetHashCode();
      if(__isset.zoom_level)
        hashcode = (hashcode * 397) + ZoomLevel.GetHashCode();
      if(__isset.min_zoom)
        hashcode = (hashcode * 397) + MinZoom.GetHashCode();
      if(__isset.max_zoom)
        hashcode = (hashcode * 397) + MaxZoom.GetHashCode();
      if(__isset.serial)
        hashcode = (hashcode * 397) + Serial.GetHashCode();
      if(__isset.timestamp)
        hashcode = (hashcode * 397) + Timestamp.GetHashCode();
    }
    return hashcode;
  }

  public override string ToString()
  {
    var sb = new StringBuilder("CameraState(");
    bool __first = true;
    if (__isset.mode)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("Mode: ");
      sb.Append(Mode);
    }
    if (__isset.zoom_level)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("ZoomLevel: ");
      sb.Append(ZoomLevel);
    }
    if (__isset.min_zoom)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("MinZoom: ");
      sb.Append(MinZoom);
    }
    if (__isset.max_zoom)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("MaxZoom: ");
      sb.Append(MaxZoom);
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

