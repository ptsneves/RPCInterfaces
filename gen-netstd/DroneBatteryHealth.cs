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



public partial class DroneBatteryHealth : TBase
{
  private double _battery_health_percent;
  private string _serial;
  private long _timestamp;

  public double BatteryHealthPercent
  {
    get
    {
      return _battery_health_percent;
    }
    set
    {
      __isset.battery_health_percent = true;
      this._battery_health_percent = value;
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
    public bool battery_health_percent;
    public bool serial;
    public bool timestamp;
  }

  public DroneBatteryHealth()
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
            if (field.Type == TType.Double)
            {
              BatteryHealthPercent = await iprot.ReadDoubleAsync(cancellationToken);
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
      var struc = new TStruct("DroneBatteryHealth");
      await oprot.WriteStructBeginAsync(struc, cancellationToken);
      var field = new TField();
      if (__isset.battery_health_percent)
      {
        field.Name = "battery_health_percent";
        field.Type = TType.Double;
        field.ID = 1;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteDoubleAsync(BatteryHealthPercent, cancellationToken);
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
    var other = that as DroneBatteryHealth;
    if (other == null) return false;
    if (ReferenceEquals(this, other)) return true;
    return ((__isset.battery_health_percent == other.__isset.battery_health_percent) && ((!__isset.battery_health_percent) || (System.Object.Equals(BatteryHealthPercent, other.BatteryHealthPercent))))
      && ((__isset.serial == other.__isset.serial) && ((!__isset.serial) || (System.Object.Equals(Serial, other.Serial))))
      && ((__isset.timestamp == other.__isset.timestamp) && ((!__isset.timestamp) || (System.Object.Equals(Timestamp, other.Timestamp))));
  }

  public override int GetHashCode() {
    int hashcode = 157;
    unchecked {
      if(__isset.battery_health_percent)
        hashcode = (hashcode * 397) + BatteryHealthPercent.GetHashCode();
      if(__isset.serial)
        hashcode = (hashcode * 397) + Serial.GetHashCode();
      if(__isset.timestamp)
        hashcode = (hashcode * 397) + Timestamp.GetHashCode();
    }
    return hashcode;
  }

  public override string ToString()
  {
    var sb = new StringBuilder("DroneBatteryHealth(");
    bool __first = true;
    if (__isset.battery_health_percent)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("BatteryHealthPercent: ");
      sb.Append(BatteryHealthPercent);
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

