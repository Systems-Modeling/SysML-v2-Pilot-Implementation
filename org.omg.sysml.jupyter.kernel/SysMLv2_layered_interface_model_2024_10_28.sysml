package InterfaceModel{
    // ran with 2024-07 on 2024-08-09
    // ran with 2024-02 on 2024-03-14 
    // ran with 2024-01 on 2024-02-07
    // ran with 2023-010 on 2023-11-08
    // ran with 2023-07 on 2023-08-03
    // updated to 2023-02
    //private import ScalarValues::*
    package Documentation{
        /* 
        * 2023-06-14 Start Interface Model based on SysML v1 model Ports & Flows trim 2016-12-01
        * 2024-02-22 newly formed Layered Interface Modeling Subgroup of SMC User WG
        * 2024-02-29 Updated model to include message structure
        * 2024-03-01 Updated model to include RASDS Views and Viewpoints
        * 2024-03-07 Updated model after discussion with Subgroup to include two bit models (Enumeration and Natural)
        *  MessageStructure_1 is Enumeration
        *  MessageStructure is Natural
        * 2024-03-14 Added Stack package that transforms the SysML v1 full ports with proxy ports for the layered stack 
        *  Refer to the the elements in the SysML v1 diagram called Port Definitions in the Proxy Port Defintions Package
        * 2024-03-15 Added elements from white box diagram to the stack package
        * 2024-03-16 Added keyword definitions for several concepts (not applied)
        * 2024-03-27 refactored the avionics subsystem and made stack connections and initial tcp states
        * 2024-04-10 reorganized model to improve integration and remove redundancies
        * 2024-04-19 corrected several metadata definitions including protocolEntity from item to part
        * 2024-06-20 review Tom Sawuer with Santiago. redefined p1 and p2 on telecom ethernetPort_Stack_x with conjugated ports 
        * 2024-06-20 based on discussion with Ed, replaced the redefined conjugated ports with the new port def EthernetPort_Stack_x_conjugated 
        * 2024-07-09 added payload input to payload output
        * 2024-08-08 minor tweek to payload sensor input for spacecraft physical
        * 2024-08-09 - included visibility on imports per latest release, 
        * also minor update per Hans Peter to attribute thermalPowerDensity :> ISQ::densityOfHeatFlowRate default = 1 ['W/m²'];
        *2024-08-15-16 updated telecom subsystem and other changes to align with SysML v1 model
        *2024-08-17 Added 1553 bus details and connection. 
        *    Still need to replace eithernet protocol entities with 1553 protocol entities
        *2024-08-22 Updates based on review at Layered Interface WG
        *     Moved bus controller outside of 1553 bus
        *     Changed #hw part to #hw and #sw part to #sw
        *     Connected pdulinks from avionics to telecom between PktXfer, TCP, and IP 
        *2024-09-20 Replace connection with binding connection to packetPort on both 
        //          avionics and telecom subsystem
        *2024-10-03 Replaced #pdu_link connect with #pdu_link interface per Austin request
        *2024-10-03 Replaced #sdu_link connect with #sdu_link interface per Austin request
        *2024-10-02 Began to update 1553 bus per Peter Shames ppt entitled 'SMC 1553 Protocol Stack Notes' dated 2024-09-23
        *2024-10-05 Added InterfaceModel_TCP developed by Austin Roberts
        *2024-10-05 Integrated InterfaceModel_TCP into the rest of the layered interface model
        *20224-10-09 Minor update to annotations in TCP Behavior based on discussion at layered interface wg on 10/9/24
        *2024-10-25 Updated integration of 1553 bus model per WG discussion on 10/24 and Peter 1553 bus notes
        *2024-10-27 Added Guy Meador's data fields model in package 'DataFieldsModel_gmeador_2024_10_27'
        *2024-10-27 Replaced private import MessageStructure::*; with nested packages in Guy's model as follows
                    private import DataFieldsModel_gmeador_2024_10_27::MessageStructure2::*;
                    private import DataFieldsModel_gmeador_2024_10_27::Message2Evolution::*;
        *2024-10-28 Tried to add ToNatural instead of ToInteger per Hans Peter on 10/27/24/ search for // added per Hans Peter on 10/27/24     
        */
    }
    private import StandardLibraries::*;
    package StandardLibraries{
            public import ScalarValues::*;
            public import NumericalFunctions::*;
            public import ISQ::*;
            public import SI::*;
            public import USCustomaryUnits::*;
            public import ParametersOfInterestMetadata::*; // mop and moe
            public import Time::*;  // added by Austin for TCP behavior model 
    }
    
    private import Definitions::*;
    
    private import TCP_ProtocolEntity::Definitions::*;  //[sf] added this package to incorporate TCP Behavior model

    package Definitions{
        public import PartDefinitions::*;
        public import PortDefinitions::*;
        public import ItemDefinitions::*;
        public import ActionDefinitions::*;
        public import MetadataDefinitions::*;
        public import Keyword_MetadataDefinitions::*;
        package PartDefinitions{
            part def Mission_Context;
            part def User1;
            part def Target;
            part def Mission_Enterprise;
            part def Spacecraft_Physical;
            part def WAN;
            part def Space_Link_Terminal;
            part def Mission_Operations_Center;
            alias MOC for Mission_Operations_Center;
            part def Telemetry_Processor;
            part def Packet_Processor_Receive;
            part def Display;
            part def SLE_Gateway;
            part def Antenna{
                port p1:~RF_Port;
            }
            
            port def RF_Port;  // move this
            
            part def Receiver;
            part def Detector;
            part def Amplifier;
            part def Digital_Decoder;  
            
            part def Payload;
            part def Payload_Sensor;
            part def Payload_Processor;
            part def Communication_Subsystem;
            part def Avionics;
            part def Thermal_Subsystem;
            part def Thermistor;
            //part def Computer;
            //part def 'C&DH_SW';
            part def Packet_Processor_Transmit;
            part def RTOS;
            part def High_Rate_Antenna{
                port p2:RF_Port;  // should RF_Port be conjugated?
            }
            part def RF_XMIT_Amplifier;
            part def Spacewire_Switch;
            part def Digital_Encoder;
            part def Communication_SW;
            
            part def Packet_to_Frame_Processor{
                port packetPort:~PacketPort;
            }

            part def OnBoardComputer{
                port packetPort:PacketPort;
            }
            part def PacketProcessor{
                port packetPort:PacketPort;
            }
            part def 'C&DH_SW'{
                port packetPort:PacketPort;
            }
            
            // ethernet
            part def EthernetPort_Stack_X{
                port p1:'1GbE_IF';
                port p2:TwistedPair_IF;
            }
            part def EthernetPort_Stack_X_conjugate{
                port p1:~'1GbE_IF';
                port p2:~TwistedPair_IF;
            }
            
            part def '1GE'{
                port p1:'1GbE_Provided_IF';
                port p2:'1GbE_IF';
                port p3:TwistedPair_Required_IF;
            }
            part def RJ45_Plug{
                port p1:TwistedPair_Provided_IF;
                port p2:TwistedPair_IF;
            }
            
            part def PacketPort_Stack_X{
                port p1:~PacketPort;
                port p2:PacketXfer_IF;
                port p3:TCP_IF;
                port p4:IP_IF;
            }
            
            port def PacketPort_Stack_X_conjugate{
                port p1:PacketPort;
                port p2:~PacketXfer_IF;
                port p3:~TCP_IF;
                port p4:~IP_IF;
            }
            
            part def IP{
                port p1:IP_Provided_IF;
                port p2:IP_IF;
                port p3:'1GbE_Required_IF';  // consider IP_Required_IF per Andrew email dated 8/19/24
            }
            part def PacketXfer{
                //port p1:PktXfer_Provided_IF; // replace with p1: ~PacketPort
                port p1:~PacketPort;
                port p2:PacketXfer_IF;
                port p3:TCP_Required_IF; // consider PacketXfer_Required_IF per Andrew email dated 8/19/24
            }
            
            part def Transceiver_S{
                port packetPort: ~PacketPort;
            }
            
            public import '1553_Bus'::*;
            package '1553_Bus'{
                part def Coupler{
                    port bncPort:StubCable_Required_IF[*];                    
                }
                part def BusCoupler{
                    port bncPort1:StubCable_Required_IF;
                    port bncPort2:StubCable_Required_IF;
                    port bncPort3:StubCable_Required_IF;
                }
                part def StubCable{
                    port bncPort1:StubCable_Provided_IF;
                    port bncPort2:StubCable_IF;  // logical
                    port bncPort3:StubCable_Provided_IF;
                }

                //part def StubCable{
                    //port bncPort1:~BNCPort;
                    //port bncPort2:StubCable_IF;  // logical
                    //port bncPort3:~BNCPort;
                //}

                part def Terminator{
                    port bncPort:StubCable_Required_IF;
                }

                part def BusController{
                    port bncPort:StubCable_Required_IF;
                }

                part def '1553_Port_Stack_X'{
                    port p1:'1553_PI_IF'; 
                    port bncPort2:StubCable_IF;
                    port bncPort3:StubCable_Provided_IF; 
                }

                part def '1553_Port_Stack_X_conjugate'{
                    port p1:~'1553_PI_IF'; 
                    port bncPort2:~StubCable_IF;
                    port bncPort3:StubCable_Provided_IF; 
                    abstract action perform1553Protocol;
                }

                part def '1553_Protocol_Interface'{
                    port p1:'1553_PI_Provided_IF';
                    port p2:'1553_PI_IF';
                    port p3:StubCable_Required_IF;
                    abstract action perform1553Protocol;
                }

                port def '1553_PI_Provided_IF';
                port def '1553_PI_IF';
                port def StubCable_Required_IF; 
                port def StubCable_Provided_IF; 
                port def StubCable_IF;
                port def BNCPort :> StubCable_Required_IF;

                action perform1553Protocol{
                    in item ipDatagram;
                    action handleIncomingIP_DG;
                    action create1553PacketPDU;
                    action loadNext_DG_FragementIntoPacketDataField;
                    action sendPacketTo1553Encoder;
                    action finishEntireIP_DG;
                    action encode1553Packet;
                    action transform1553Packet;
                }
            }
        }
        package PortDefinitions{
            port def TwistedPair_IF{
                port 'pin 1 DA+ white/green':Pin1;
                port 'pin 2 DA- green':Pin2;
                port 'pin 3 DB+ white/orange':Pin3;
                port 'pin 4 DC+ blue':Pin4;
                port 'pin 5 DC- white/blue':Pin5;
                port 'pin 6 DB- orange':Pin6;
                port 'pin 7 DD+ white/brown':Pin7;
                port 'pin 8 DD- brown':Pin8;
            }
            port def Pin1;
            port def Pin2;
            port def Pin3;
            port def Pin4;
            port def Pin5;
            port def Pin6;
            port def Pin7;
            port def Pin8;
                
            public import TransformedProxyPorts::*;
            package TransformedProxyPorts{
                // transformation of proxy ports from v1 model into port def
                // change IF to port
                port def RF_IF;
                port def Physical_IF;
                port def CoaxConnector_IF;
                port def RG59_IF;
                port def '1GbE_IF';
                port def Symbol_IF;
                port def Vita_49_Packet_IF;
                port def UDP_IF;
                port def IP_IF;
                port def Frame_IF;
                port def PacketXfer_IF;
                port def PktXfer_Provided_IF;
                port def TwistedPair_Provided_IF;
                port def PacketPort{
                    //out item space_Packet:Space_Packet;
                    out item space_Packet:> space_Packet;
                }
                // included in TCP_ProtocolEntity package
                //port def TCP_IF;
                //port def TCP_Required_IF;
                //port def TCP_Proivded_IF;
                port def IP_Required_IF;
                port def IP_Provided_IF;
                port def '1GbE_Required_IF';
                port def '1GbE_Provided_IF';
                port def TwistedPair_Required_IF;

                port def TwistedPair_IF{
                    port 'pin 1 DA+ white/green':Pin1;
                    port 'pin 2 DA- green':Pin2;
                    port 'pin 3 DB+ white/orange':Pin3;
                    port 'pin 4 DC+ blue':Pin4;
                    port 'pin 5 DC- white/blue':Pin5;
                    port 'pin 6 DB- orange':Pin6;
                    port 'pin 7 DD+ white/brown':Pin7;
                    port 'pin 8 DD- brown':Pin8;
                }
                port def Pin1;
                port def Pin2;
                port def Pin3;
                port def Pin4;
                port def Pin5;
                port def Pin6;
                port def Pin7;
                port def Pin8;
            }
        }
        package ItemDefinitions{
            item def Packet{
            }
            item def Frame{
            }
            item def RF{
                attribute frequency;
            }
            
            
            item '10GE PDU';
            //item bit;
            item Electrical_Signal;
            item Emissions;
            item Encoded_Symbol_Data;
            //item Frame_Data;
            item Housekeeping_Data;
            /*
            Housekeeping Message
            IP PDU
            Observation Data
            Observation Message
            Observation Signal
            octet
            Packet Data Field
            Packet Identification
            Packet Primary Header
            Packet Sequence Control
            Packet Xfer PDU
            RF Signal
            Science Packet
            Space Packet
            TCP PDU
            Telemetry Data
            Telemetry Info
            Temperature
            Temperature Data
            Thermal Housekeeping Message
            Thermal Packet
            Thermal Packet Data Field
            Thermistor Data
            */
            
            
            item def PassiveOpen;
            item def Close;
            
            item def RF_Signal;
            item def EncodedSymbol_Data;
            item def Frame_Data;
            item def Space_Packet;
            item def Thermal_Packet :> Space_Packet;
            item def Telemetry_Data;
        }
        package ActionDefinitions{
            action def Process_Packet{
                in item packet:Packet;
                out item frame1:Frame;
                action x;
                action y;
                first x then y;
            }
        }
        package MetadataDefinitions{
            metadata def Safety {
                attribute isMandatory : Boolean;
            }
            metadata def Security;
        }
        package Keyword_MetadataDefinitions{
            private import Metaobjects::SemanticMetadata;
            
            item pdu_Links [*] nonunique;
            metadata def pdu_link :> SemanticMetadata {
                :>> baseType = 'pdu_Links' meta SysML::ConnectionUsage;
            }
            
            item sdu_Links [*] nonunique;
            metadata def sdu_link :> SemanticMetadata {
                :>> baseType = 'sdu_Links' meta SysML::ConnectionUsage;
            }
            
            item pdus [*] nonunique;
            metadata def <pdu_data> protocolDataUnit :> SemanticMetadata {
                :>> baseType = 'pdus' meta SysML::ItemUsage;
            }
            
            item sdus [*] nonunique;
            metadata def <sdu_data> :> SemanticMetadata {
                :>> baseType = 'sdus' meta SysML::ItemUsage;
            }
            
            part protocolEntities [*] nonunique;
            metadata def protocolEntity :> SemanticMetadata {
                :>> baseType = protocolEntities meta SysML::PartUsage;
            }
            
            part softwareComponents [*] nonunique;
            metadata def <sw> software :> SemanticMetadata {
                :>> baseType = softwareComponents meta SysML::PartUsage;
            }
            
            part hardwareComponents [*] nonunique;
            metadata def <hw> hardware :> SemanticMetadata {
                :>> baseType = hardwareComponents meta SysML::PartUsage;
            }
            
            part subsystems [*] nonunique;
            metadata def subsystem :> SemanticMetadata {
                :>> baseType = subsystems meta SysML::PartUsage;
            }
            
            part systems [*] nonunique;
            metadata def system :> SemanticMetadata {
                :>> baseType = systems meta SysML::PartUsage;
            }
        }
        
        package TCP_ProtocolEntity{
            public import Definitions::*;
            package Definitions{
                public import PartDefinitions::*;
                public import PortDefinitions::*;
                public import ItemDefinitions::*;
                
                package PartDefinitions{
                    part def TCP{
                        port p1:TCP_Proivded_IF;
                        port p2:TCP_IF;
                        port p3:TCP_Required_IF;
                        perform action tcpSendCallProcessing;
                        exhibit state tcp_States;
                    }
                }
                package PortDefinitions{
                    port def TCP_Required_IF;
                    port def TCP_Proivded_IF;
                    port def TCP_IF;
                }
                package ItemDefinitions{
                    //TPU SDU Signals
                    item def PassiveOpen;
                    item def ActiveOpen;
                    item def Close;
                    item def Send;
                    //TPU PDU Signals
                    item def ACK;
                    item def FIN;
                    item def 'FIN+ACK';
                    item def RST;
                    item def SYN;
                    item def 'SYN+ACK';
                    //Send Call Actions Items
                    item def SND{
                        attribute NXT:Natural;
                        attribute UNA:Natural;
                        attribute WND:Natural;
                    }
                    item def Segment{
                        attribute SEQ:Natural;
                        attribute ACK:Natural;
                        attribute CTL:Natural;
                    }
                    item def RCV{
                        attribute NXT:Natural;
                    }
                }
                package ActionDefinitions{
                    action def PassiveOpen;
                    action def ActiveOpen;
                    action def Close;
                    action def Send;
                    action def ACK;
                    action def FIN;
                    action def SYN;
                    action def 'SYN+ACK';
                    action def TcpSendCallProcessing{
                        in part tcp:TCP;
                        private attribute sendBufferData:Natural;
                        first start;
                        then merge continueListening;
                        //then action receiveSendCall accept sendCall:SND via TCP::p2;
                        then action receiveSendCall accept sendCall:SND via tcp.p2;  //[sf]
                        then action queueData{
                            in snd:SND = receiveSendCall.sendCall;
                            out sndOut:SND = snd;
                        }
                        then decide;
                            if queueData.sndOut.NXT < (queueData.sndOut.UNA + queueData.sndOut.WND) then sufficientData;     
                            else continueListening;

                        decide sufficientData;
                            if sendBufferData > 5 then createNewSegment;
                            else continueListening;

                        action createNewSegment{
                            in sndIn:SND = queueData.sndOut;
                            out item segment:Segment;
                            item rcv:RCV;
                            item ack:ItemDefinitions::ACK;
                            assign segment.SEQ := sndIn.NXT;
                            then assign segment.ACK := rcv.NXT;
                            then assign segment.CTL := ack;
                        }

                        //then action sendSegment send Segment(createNewSegment.segment) via TCP::p2;
                        action sendSegment send segment() via tcp.p2 {  // [sf]
                            in segment:Segment = createNewSegment.segment;
                        } 
                        then sendSegment; // [sf]
                        then action 'SND.NXT := SND.NXT + SEG.LEN';
                        then action 'Add data just sent to the Rexmt Queue';
                        then action 'CalcRTO(RTO)';
                        then action 'SET(RTO, REXMT)';
                        then continueListening;
                    }
                }
            }
            package Configurations{
                // [sf] added this package
                package PartsTree{
                    part tcp:TCP{
                        perform ActionTree::tcpSendCallProcessing :>> tcpSendCallProcessing{
                            //action :>> receiveSendCall accept sendCall:SND via tcp.p2; 
                            action :>> receiveSendCall {
                                in ref :>> receiver = tcp.p2;
                            }
                            action :>> sendSegment {
                                in :>> source = tcp.p2;
                            }
                        }
                        exhibit StateTree::tcp_States :>> tcp_States{
                            state :>> established{
                                do tcpSendCallProcessing :>> tcpSendCallProcessing;
                            }
                        }
                    }
                }
                package ActionTree{
                    // [sf] changed action def to action
                    action tcpSendCallProcessing{
                        //in part tcp:TCP;  [sf] removed this
                        private attribute sendBufferData:Natural;
                        //action receiveSendCall accept sendCall:SND via self;  //[sf]
                        // [sf] replaced the above with the following
                        action receiveSendCall accept sendCall:SND{
                            //in ref receiver default self;
                        }
                        first start;
                        then merge continueListening;  // added merge node to continue listening until it exits establish state
                        //then action receiveSendCall accept sendCall:SND via TCP::p2;
                        then receiveSendCall;  //[sf]
                        then action queueData{
                            in snd:SND = receiveSendCall.sendCall;
                            out sndOut:SND = snd;
                        }
                        then decide;
                            if queueData.sndOut.NXT < (queueData.sndOut.UNA + queueData.sndOut.WND) then sufficientData;     
                            else continueListening;

                        decide sufficientData;
                            if sendBufferData > 5 then createNewSegment;  // 5 is arbitrary
                            else continueListening;

                        action createNewSegment{
                            in sndIn:SND = queueData.sndOut;
                            out item segment:Segment;
                            item rcv:RCV;
                            item ack:ItemDefinitions::ACK;
                            assign segment.SEQ := sndIn.NXT;
                            then assign segment.ACK := rcv.NXT;
                            then assign segment.CTL := ack;
                        }

                        //then action sendSegment send Segment(createNewSegment.segment) via TCP::p2;
                        //action sendSegment send segment() via self {  
                            //in segment:Segment = createNewSegment.segment;
                        //} 
                        // [sf] replaced the above with the following
                        action sendSegment send segment() via source {  
                            in segment:Segment = createNewSegment.segment;
                            in source default self;
                        } 
                        then sendSegment; // [sf]
                        then action 'SND.NXT := SND.NXT + SEG.LEN';
                        then action 'Add data just sent to the Rexmt Queue';
                        then action 'CalcRTO(RTO)';
                        then action 'SET(RTO, REXMT)';
                        then continueListening;
                    }
                }
                package StateTree{
                    // [sf] changed state def to state/ removed qualified name for ItemDefinitions::Close
                    state tcp_States{
                        entry action initial;
                        state closed;
                        state listen;
                        state syn_sent;
                        state syn_received;
                        state established{
                            do action tcpSendCallProcessing; // [sf] changed this to lower case tcp
                        }
                        state fin_wait_1;
                        state fin_wait_2;
                        state time_wait;
                        state closing;
                        state close_wait;
                        state last_ack;

                        // [sf] should the do actions be do send (e.g., do send SYN() via self ) - No, they are effect actions
                        transition initial then closed;
                        transition closed_to_listen
                            first closed
                            accept PassiveOpen //This is a CallEvent in the v1 model
                            then listen;
                        transition closed_to_synSent
                            first closed
                            accept ActiveOpen //This is a CallEvent in the v1 model
                                do action SYN
                            then syn_sent;
                        transition listen_to_closed
                            first listen
                            accept Close //This is a CallEvent in the v1 model
                            then closed;
                        transition listen_to_synRecieved
                            first listen
                            accept SYN
                                do action 'SYN+ACK'
                            then syn_received;
                        transition listen_to_synSent
                            first listen
                            accept Send
                                do action SYN
                            then syn_sent;
                        transition synSent_to_closed //There is no trigger in the v1 model. The spec has the Close trigger so I have added it here.
                            first syn_sent
                            accept Close //This is a CallEvent in the v1 model
                            then closed;
                        transition synSent_to_established
                            first syn_sent
                            accept 'SYN+ACK'
                                do action ACK
                                then established;
                        transition synSent_to_synRecieved
                            first syn_sent
                            accept SYN
                                do action 'SYN+ACK'
                                then syn_received;
                        transition synRecieved_to_listen
                            first syn_received
                            accept RST
                            then listen;
                        transition synRecieved_to_established
                            first syn_received
                            accept ACK
                            then established;
                        transition synRecieved_to_finWait1
                            first syn_received
                            accept Close //This is a CallEvent in the v1 model
                                do action FIN
                            then fin_wait_1;
                        transition established_to_finWait1
                            first established
                            accept Close //This is a CallEvent in the v1 model
                                do action FIN
                            then fin_wait_1;
                        transition established_to_closeWait
                            first established
                            accept FIN
                                do action ACK
                            then close_wait;
                        transition finWait1_to_closing
                            first fin_wait_1
                            accept FIN
                                do action ACK
                            then closing;
                        transition finWait1_to_finWait2
                            first fin_wait_1
                            accept ACK
                            then fin_wait_2;
                        transition finWait1_to_timeWait
                            first fin_wait_1
                            accept 'FIN+ACK'
                                do action ACK
                            then time_wait;
                        transition finWait2_to_timeWait
                            first fin_wait_2
                            accept FIN
                                do action ACK
                            then time_wait;
                        transition closing_to_timeWait
                            first closing
                            accept ACK
                            then time_wait;
                        transition timeWait_to_closed
                            first time_wait
                            accept after 0.002 [s]
                            then closed;
                        transition closeWait_to_lastAck
                            first close_wait
                            accept Close
                                do action FIN
                            then last_ack;
                        transition lastAck_to_closed
                            first last_ack
                            accept ACK
                            then closed;    
                    }
                }
            }
            package Interactions{
                //[sf] changed occurrence defs to occurrence usages and referenced tcp in Configurations::PartsTree package
                occurrence tcpConnectionEstablishmentProtocol{
                    occurrence tcpEstablished:> tcpEstablished_1;  // [sf]
                    ref part tcpClient :> Configurations::PartsTree::tcp {
                        /*This is intantiated as the TCP Client*/
                        port :>> p1{
                            //Add events for the TCP Provided interface
                            event occurrence activeOpenRecieved;
                            then event occurrence closeRecieved;
                        }
                        port :>> p2{
                            //Add events for the TCP interface
                            event synMessage.sourceEvent;
                            then event synAckMessage.targetEvent;
                            then event ackMessage.sourceEvent;
                            //then event occurrence refTcpClientEstablished = TCPEstablished::tcpClient.tcpClientEstablished;
                            then event occurrence refTcpClientEstablished = tcpEstablished.tcpClient.tcpClientEstablished;  // [sf]
                            then event finMessage.sourceEvent;
                            then event ackServerMessage.targetEvent;
                            then event finServerMessage.targetEvent;
                            then event ackMessage.sourceEvent;
                        }     
                    }
                    ref part tcpServer :> Configurations::PartsTree::tcp{
                        /*This is intantiated as the TCP Server*/
                        port :>> p1{
                            //Add events for the TCP Provided interface
                            event occurrence passiveOpenRecieved;
                            then event occurrence closeRecieved;
                        }
                        port :>> p2{
                            //Add events for the TCP interface 
                            event synMessage.targetEvent;
                            then event synAckMessage.sourceEvent;
                            then event ackMessage.targetEvent;
                            //then event occurrence refTcpServerEstablished = TCPEstablished::tcpServer.tcpServerEstablished;
                            then event occurrence refTcpServerEstablished = tcpEstablished.tcpServer.tcpServerEstablished; // [sf]
                            then event finMessage.targetEvent;
                            then event ackServerMessage.sourceEvent;
                            then event finServerMessage.sourceEvent;
                            then event ackMessage.targetEvent;
                        }   
                    }
                    //Define the messages
                    message synMessage of ItemDefinitions::SYN
                        from tcpClient.p2
                        to tcpServer.p2;
                    message synAckMessage of ItemDefinitions::'SYN+ACK'
                        from tcpServer.p2
                        to tcpClient.p2;
                    message ackMessage of ItemDefinitions::ACK
                        from tcpClient.p2
                        to tcpServer.p2;
                    message finMessage of ItemDefinitions::FIN
                        from tcpClient.p2
                        to tcpServer.p2;
                    message ackServerMessage of ItemDefinitions::FIN
                        from tcpServer.p2
                        to tcpClient.p2;
                    message finServerMessage of ItemDefinitions::FIN
                        from tcpServer.p2
                        to tcpClient.p2;
                    message ackCloseMessage of ItemDefinitions::ACK
                        from tcpClient.p2
                        to tcpServer.p2;
                }
                occurrence tcpEstablished_1{
                    ref part tcpClient :> Configurations::PartsTree::tcp{
                        event occurrence tcpClientEstablished;     // [sf] this needs to align with accepting an event in tcp_States
                    }
                    ref part tcpServer :> Configurations::PartsTree::tcp{
                       event occurrence tcpServerEstablished; // [sf] this needs to align with accepting an event in tcp_States
                    }
                }
            }
        }
    }
    
    //private import MessageStructure::*;
    //private import DataFieldsModel_gmeador_2024_10_27::MessageStructure2::*;
    private import DataFieldsModel_gmeador_2024_10_27::Message2Evolution::*;
    
    package MessageStructure{
        private import SequenceFunctions::*; // used for size function
        private import BitModel::*;
        
        package BitModel{
            attribute bit:Natural {constraint {bit>=0 and bit <=1}}
            
            attribute def Bit :> Natural { 
                doc /*   */
                assert constraint {0 <= that and that <=1}
            }
            
            item def Octet{
                attribute bits:Bit [8] ordered nonunique;   
            }
            
        }

        requirement 'CCSDS 133.0-B-1';
        allocate 'CCSDS 133.0-B-1' to spacePacket;
        abstract #pdu_data spacePacket{
            item packet_fields [*] ordered nonunique = (packetPrimaryHeader, packetDataField);
            item packetPrimaryHeader :> packetPrimaryHeaders, packet_fields [1] ordered nonunique;
            item packetDataField :> packetDataFields, packet_fields [1] ordered nonunique;
        }
        item packetPrimaryHeaders ordered nonunique{
            item fields [*] ordered nonunique = (packetIdentification, packetSequenceControl, packetDataLength);
            attribute packetVersionNumber:Bit[3] ordered nonunique;
            item packetIdentification :> packetIdentifications, fields [1] ordered nonunique;
            item packetSequenceControl :> packetSequenceControls, fields [1] ordered nonunique;
            item packetDataLength : Octet :> fields [2] ordered nonunique; 
            //item packetDataLength :> octet [2] ordered nonunique; 
        }

        item packetIdentifications ordered nonunique{
            attribute bits [*] ordered nonunique = (packetType, secondaryHeaderFlag, applicationProcessIdentifier);
            attribute packetType:Bit [1] :> bits;
            attribute secondaryHeaderFlag:Bit [1] :> bits;
            attribute applicationProcessIdentifier:Bit :> bits [11] ordered nonunique;
        }
        item packetSequenceControls ordered nonunique{
            attribute bits [*] ordered nonunique = (sequenceFlags, packetSequenceCount);
            attribute sequenceFlags:Bit :> bits [2] ordered nonunique;
            attribute packetSequenceCount:Bit :> bits [14] ordered nonunique;
        }
        item packetDataFields ordered nonunique{
            item octets:Octet [0..*] ordered nonunique = (packetSecondaryHeader, userDataField);
            item packetSecondaryHeader :> octets [0..*] ordered nonunique;
            item userDataField :> octets [0..*] ordered nonunique;
            constraint {(size (packetSecondaryHeader) + size (userDataField)) <= 65536 and 
                (size (packetSecondaryHeader) + size (userDataField)) > 1}
        }
        
        //item def Octet{  // redundant with line 461 per Andrew email dated 8/19/24
            //attribute bits:Bit [8] ordered nonunique;   
        //}

        //item octet ordered nonunique{
            //attribute bits:Bit [8] ordered nonunique;
        //}

        // replace attribute bits [*] with item bitSequence [*] so they can be subsetted and contain bit values as follows
        // this all should be in a library or a function that assigns creates a bitSequence of n bits from a value such as '0600' 
        item bitSequence ordered nonunique{
            attribute bits:Bit [*] ordered nonunique;
        }
        item bitSequence_11 :> bitSequence ordered nonunique{
            attribute bits:>> bits [11] ordered nonunique;
        }
        item '0b00' :> bitSequence_11 ordered nonunique{
            attribute bit1 [1] :> bits = 0;
            attribute bit2 [1] :> bits = 0;
            // other bits
            attribute bit111 [1] :> bits = 1;
        }

        #pdu_data thermalPacket :> spacePacket{
            item thermalPacketPrimaryHeader:>> packetPrimaryHeader ordered nonunique {
                //attribute :>> packetVersionNumber = '0b00';  // non conforming type: change attribute to item
                attribute '0b00':>> packetVersionNumber; // set attribute value to 0b00 using bitSeuence above
                item :>> packetIdentification ordered nonunique{
                    attribute :>> packetType = 0;
                    attribute :>> secondaryHeaderFlag = 1;
                    attribute '0x37':>> applicationProcessIdentifier;  // set attribute value to 0x37
                }
            }
            item thermalPacketDataField :>> packetDataField ordered nonunique {
                item packetTimeStamp :> packetSecondaryHeader [6] ordered nonunique;
                item telemetryPacketType :> packetSecondaryHeader [1];
                item timeStamp :> userDataField [3] ordered nonunique;
                item temperature :> userDataField [2] ordered nonunique;
            }
        }
    }
    
    package Spacecraft{
        package PartsTree{
            #system spacecraft_Physical{
                // the following is a preliminary placeholder to discuss the payload interfaces
                #subsystem payload:Payload{
                    #hw payload_Sensor:Payload_Sensor{
                        port sensorInPort{
                            in item thermalEmissions{
                                attribute thermalPowerDensity :> ISQ::densityOfHeatFlowRate;
                            }
                        }
                        port sensorOutPort{
                            out item thermalSignal;
                        }
                        perform action senseEmissions{
                            in item thermalEmissions = sensorInPort.thermalEmissions {
                                attribute thermalPowerDensity :> ISQ::densityOfHeatFlowRate default = 1 ['W/m²'];
                                // or attribute thermalPowerDensity : ISQ::DensityOfHeatFlowRateValue default = 1 ['W/m²'];
                                // SI units of irradiance (or energy per second per unit area), which is W m –2.
                            }
                            out item thermalSignal{
                                attribute analogSignal:Real;
                            }
                        }
                    }
                    #hw payload_Processor:Payload_Processor{
                        port analogPort{
                            in item thermalSignal;
                        }
                        port digitalPort{
                            out item digitalStream;
                        }
                        perform action processSignal{
                            in item thermalSignal{
                                attribute analogSignal:Real;
                            }
                            out item digitalStream{
                                attribute digitalSignal;
                            }
                        }
                    }
                    flow flow1 from payload_Sensor.senseEmissions.thermalSignal
                        to payload_Processor.processSignal.thermalSignal;
                }
                #subsystem avionicsSubsystem:Avionics{
                    port packetPort:PacketPort = onBoardComputer.pp2;
                    #hw onBoardComputer:OnBoardComputer{
                        port pp2:>> packetPort = 'c&dh sw'.pp1;
                        #sw 'c&dh sw':'C&DH_SW'{
                            port pp1:>> packetPort = p2.packetPort;
                            #sw p2:PacketProcessor{
                                port packetPort :>> packetPort = p3.p1;
                            }
                            part p3:PacketPort_Stack_X{
                                port :>> p1 = 'c&dh sw'.p2.packetPort;
                                #protocolEntity pktXfer:PacketXfer{
                                    port :>> p1;
                                    port :>> p3;
                                }
                                //#protocolEntity tcp:TCP{
                                    //port :>> p1;
                                    //port :>> p2;
                                    //port :>> p3;
                                //}
                                #protocolEntity tcp :> TCP_ProtocolEntity::Configurations::PartsTree::tcp {
                                    port :>> p1;
                                    //port :>> p2;
                                    port :>> p3;
                                }
                                #protocolEntity ip:IP{
                                    port :>> p1;
                                    port :>> p3;
                                }
                                //part part5:'1GE';
                                //part part6:RJ45_Plug; 
                                bind pktXfer.p1 = p1;
                                #sdu_link interface pktXfer.p3 to tcp.p1;
                                #sdu_link interface tcp.p3 to ip.p1;
                            }
                            //#sdu_link interface p2.packetPort to p3.p1;
                        }
                        part ethernetPort_Stack_X:EthernetPort_Stack_X{  
                            port p1_a:>> p1;
                            port p2_a:>> p2;
                            #protocolEntity '1ge':'1GE'{
                                port :>> p1;
                                port :>> p2;
                                port :>> p3;
                            }
                            #protocolEntity rj45_plug:RJ45_Plug{
                                port :>> p2;
                            }

                            #sdu_link interface '1ge'.p3 to rj45_plug.p1;
                            bind '1ge'.p2 = p1_a;
                            bind rj45_plug.p2 = p2_a;
                        }
                        #sw rtos:RTOS;
                        #sdu_link interface 'c&dh sw'.p3.ip.p3 to ethernetPort_Stack_X.'1ge'.p1;
                    }
                }
                #subsystem telecomSubsystem{
                    port packetPort = transceiver.packetPort;
                    #hw transceiver:Transceiver_S{
                        port :>> packetPort = communication_SW.packetPort;
                        #sw communication_SW:Communication_SW{
                            port packetPort = part2.packetPort;
                            part p3:PacketPort_Stack_X_conjugate{
                                port :>> p1 = part2.packetPort;
                                #protocolEntity pktXfer:PacketXfer{
                                    port :>> p1;
                                    port :>> p3;
                                }
                                //#protocolEntity tcp:TCP{
                                    //port :>> p1;
                                    //port :>> p2;
                                    //port :>> p3;
                                //}
                                #protocolEntity tcp :> TCP_ProtocolEntity::Configurations::PartsTree::tcp {
                                    port :>> p1;
                                    //port :>> p2;
                                    port :>> p3;
                                }
                                #protocolEntity ip:IP{
                                    port :>> p1;
                                    port :>> p3;
                                }
                                bind pktXfer.p1 = p1;
                                #sdu_link interface pktXfer.p3 to tcp.p1;
                                #sdu_link interface tcp.p3 to ip.p1;
                            }
                            #sw part2:Packet_to_Frame_Processor{
                                port :>> packetPort;
                            }
                            //#sdu_link interface part2.packetPort to p3.p1;
                        }
                        part ethernetPort_Stack_X: EthernetPort_Stack_X_conjugate{
                            port p1_b:>> p1;
                            port p2_b:>> p2;
                            #protocolEntity '1ge':'1GE'{
                                port :>> p1;
                                port :>> p2;
                            }
                            #protocolEntity rj45_plug:RJ45_Plug{
                                port :>> p1;
                                port :>> p2;
                            }

                            #sdu_link interface '1ge'.p3 to rj45_plug.p1;
                            bind '1ge'.p2 = p1_b;
                            bind rj45_plug.p2 = p2_b;
                        }
                        #sdu_link interface communication_SW.p3.ip.p3 to ethernetPort_Stack_X.'1ge'.p1;
                    }
                    
                    #hw high_Rate_Antenna:High_Rate_Antenna;  
                    #hw rf_XMIT_Amplifier:RF_XMIT_Amplifier;
                    #hw spacewire_Switch:Spacewire_Switch;
                    #hw digital_Encoder:Digital_Encoder {@Security;}
                }
                
                #pdu_link interface  avionicsSubsystem.packetPort to telecomSubsystem.packetPort{
                    message of tp:Thermal_Packet from avionicsSubsystem.packetPort.space_Packet
                        to telecomSubsystem.packetPort.space_Packet;
                }
                #pdu_link interface avionicsSubsystem.onBoardComputer.ethernetPort_Stack_X.p1_a
                    to telecomSubsystem.transceiver.ethernetPort_Stack_X.p1_b;
                #pdu_link interface avionicsSubsystem.onBoardComputer.ethernetPort_Stack_X.p2_a
                    to telecomSubsystem.transceiver.ethernetPort_Stack_X.p2_b;
                
                #pdu_link interface avionicsSubsystem.onBoardComputer.'c&dh sw'.p3.pktXfer.p2 to telecomSubsystem.transceiver.communication_SW.p3.pktXfer.p2;                
                #pdu_link interface avionicsSubsystem.onBoardComputer.'c&dh sw'.p3.tcp.p2 to telecomSubsystem.transceiver.communication_SW.p3.tcp.p2;                  
                #pdu_link interface avionicsSubsystem.onBoardComputer.'c&dh sw'.p3.ip.p2 to telecomSubsystem.transceiver.communication_SW.p3.ip.p2; 
                
            }
        }
    }
    package Spacecraft_with_Bus{
        package PartsTree{
            #system spacecraft_Physical{
                // the following is a preliminary placeholder to discuss the payload interfaces
                #subsystem payload:Payload{
                    #hw payload_Sensor:Payload_Sensor{
                        port sensorInPort{
                            in item thermalEmissions{
                                attribute thermalPowerDensity :> ISQ::densityOfHeatFlowRate;
                            }
                        }
                        port sensorOutPort{
                            out item thermalSignal;
                        }
                        perform action senseEmissions{
                            in item thermalEmissions = sensorInPort.thermalEmissions {
                                attribute thermalPowerDensity :> ISQ::densityOfHeatFlowRate default = 1 ['W/m²'];
                                // or attribute thermalPowerDensity : ISQ::DensityOfHeatFlowRateValue default = 1 ['W/m²'];
                                // SI units of irradiance (or energy per second per unit area), which is W m –2.
                            }
                            out item thermalSignal{
                                attribute analogSignal:Real;
                            }
                        }
                    }
                    #hw payload_Processor:Payload_Processor{
                        port analogPort{
                            in item thermalSignal;
                        }
                        port digitalPort{
                            out item digitalStream;
                        }
                        perform action processSignal{
                            in item thermalSignal{
                                attribute analogSignal:Real;
                            }
                            out item digitalStream{
                                attribute digitalSignal;
                            }
                        }
                    }
                    flow flow1 from payload_Sensor.senseEmissions.thermalSignal
                        to payload_Processor.processSignal.thermalSignal;
                }
                #subsystem avionicsSubsystem:Avionics{
                    port packetPort:PacketPort = onBoardComputer.pp2;
                    #hw onBoardComputer:OnBoardComputer{
                        port pp2:>> packetPort = 'c&dh sw'.pp1;
                        #sw 'c&dh sw':'C&DH_SW'{
                            port pp1:>> packetPort = p2.packetPort;
                            #sw p2:PacketProcessor{
                                port packetPort :>> packetPort = p3.p1;
                            }
                            part p3:PacketPort_Stack_X{
                                port :>> p1 = 'c&dh sw'.p2.packetPort;
                                #protocolEntity pktXfer:PacketXfer{
                                    port :>> p1;
                                    port :>> p2;
                                    port :>> p3;
                                }
                                #protocolEntity tcp :> TCP_ProtocolEntity::Configurations::PartsTree::tcp {
                                    port :>> p1;
                                    //port :>> p2;
                                    port :>> p3;
                                }
                                #protocolEntity ip:IP{
                                    port :>> p1;
                                    port :>> p2;
                                    port :>> p3;
                                }
                                //part part5:'1GE';
                                //part part6:RJ45_Plug; 
                                bind pktXfer.p1 = p1;
                                #sdu_link interface pktXfer.p3 to tcp.p1;
                                #sdu_link interface tcp.p3 to ip.p1;
                            }
                            //#sdu_link interface p2.packetPort to p3.p1;
                        }
                        part '1553_Port_Stack_x':'1553_Port_Stack_X'{  
                            port p1_b:>> p1;
                            port p2_b:>> bncPort2;
                            port p3_b :>> bncPort3;
                            
                            #protocolEntity '1553_protocol_interface':'1553_Protocol_Interface'{
                                port :>> p1;
                                port :>> p2;
                                port :>> p3;
                            }

                            #protocolEntity stubCable:StubCable{
                                port :>> bncPort1;
                                port :>> bncPort2;  // logical
                                port :>> bncPort3;
                            }
                            #sdu_link interface '1553_protocol_interface'.p3 to stubCable.bncPort1;
                            bind '1553_protocol_interface'.p2 = p1_b;
                            bind stubCable.bncPort2 = p2_b;
                        }
                        
                        #sw rtos:RTOS; // how is this integrated in
                        
                        #sdu_link interface 'c&dh sw'.p3.ip.p3 to 
                            '1553_Port_Stack_x'.'1553_protocol_interface'.p1;
                            /*
                            port p1_a:>> p1;
                            port p2_a:>> p2;
                            #protocolEntity '1ge':'1GE'{
                                port :>> p1;
                                port :>> p2;
                                port :>> p3;
                            }
                            #protocolEntity rj45_plug:RJ45_Plug{
                                port :>> p2;
                            }
                            
                            
                            #sdu_link interface '1ge'.p3 to rj45_plug.p1;
                            bind '1ge'.p2 = p1_a;
                            bind rj45_plug.p2 = p2_a;
                        }
                        #sw rtos:RTOS;
                        #sdu_link interface 'c&dh sw'.p3.ip.p3 to '1553_Port_Stack_x'.'1ge'.p1;
                    */
                    }
                }
                #subsystem telecomSubsystem{
                    port packetPort = transceiver.packetPort;

                    #hw transceiver:Transceiver_S{
                        port :>> packetPort = communication_SW.packetPort;
                        #sw communication_SW:Communication_SW{
                            port packetPort = part2.packetPort;
                            part p3:PacketPort_Stack_X_conjugate{
                                port :>> p1 = part2.packetPort;
                                #protocolEntity pktXfer:PacketXfer{
                                    port :>> p1;
                                    port :>> p2;
                                    port :>> p3;
                                }
                                #protocolEntity tcp :> TCP_ProtocolEntity::Configurations::PartsTree::tcp {
                                    port :>> p1;
                                    //port :>> p2;
                                    port :>> p3;
                                }
                                #protocolEntity ip:IP{
                                    port :>> p1;
                                    port :>> p2;
                                    port :>> p3;
                                }
                                bind pktXfer.p1 = p1;
                                #sdu_link interface pktXfer.p3 to tcp.p1;
                                #sdu_link interface tcp.p3 to ip.p1;
                            }
                            #sw part2:Packet_to_Frame_Processor{
                                port :>> packetPort;
                            }
                            //#sdu_link interface part2.packetPort to p3.p1;
                        }
                        part '1553_Port_Stack_x': '1553_Port_Stack_X_conjugate'{
                            port p1_b:>> p1;
                            port p2_b:>> bncPort2;
                            port p3_b :>> bncPort3;
                            
                            #protocolEntity '1553_protocol_interface':'1553_Protocol_Interface'{
                                port :>> p1;
                                port :>> p2;
                                port :>> p3;
                            }

                            #protocolEntity stubCable:StubCable{
                                port :>> bncPort1;
                                port :>> bncPort2;  // logical
                                port :>> bncPort3;
                            }
                            
                            #sdu_link interface '1553_protocol_interface'.p3 to stubCable.bncPort1;
                            bind '1553_protocol_interface'.p2 = p1_b;
                            bind stubCable.bncPort2 = p2_b;
                        }
                        #sdu_link interface communication_SW.p3.ip.p3 to 
                            '1553_Port_Stack_x'.'1553_protocol_interface'.p1;
                    }
                    
                    #hw high_Rate_Antenna:High_Rate_Antenna;  
                    #hw rf_XMIT_Amplifier:RF_XMIT_Amplifier;
                    #hw spacewire_Switch:Spacewire_Switch;
                    #hw digital_Encoder:Digital_Encoder {@Security;}
                }
                
                #hw '1553_coupler':Coupler {
                    port bncPort_a [1] :> bncPort; // connect to busController
                    port bncPort_b [1] :> bncPort; // connect to avionicsSubsytem
                    port bncPort_c [1] :> bncPort; // connect to teleconSubsystem
                    part busCoupler1:BusCoupler;
                    part busCoupler2:BusCoupler;
                    part busCoupler3:BusCoupler;
                    part stubCable1:StubCable;
                    part stubCable2:StubCable;
                    part stubCable3:StubCable;
                    part terminator1:Terminator{
                        port :>> bncPort;
                    }
                    part terminator2:Terminator{
                        port :>> bncPort;
                    }
                    bind busCoupler1.bncPort3 = bncPort_a;
                    bind busCoupler2.bncPort3 = bncPort_b;
                    bind busCoupler3.bncPort3 = bncPort_c;
                    connect busCoupler2.bncPort1 to terminator1.bncPort;
                    connect busCoupler3.bncPort2 to terminator2.bncPort;
                    connect busCoupler2.bncPort2 to stubCable1.bncPort1;
                    connect busCoupler1.bncPort1 to stubCable1.bncPort3;
                    connect busCoupler1.bncPort3 to stubCable2.bncPort1;
                    connect busCoupler3.bncPort1 to stubCable2.bncPort3;
                }
                
                #hw busController:BusController{
                    port :>> bncPort;
                }
                
                connect '1553_coupler'.bncPort_a to busController.bncPort;
                
                // connect subsystems to 1553 bus
                #pdu_link interface avionicsSubsystem.onBoardComputer.'1553_Port_Stack_x'.p3_b
                    to '1553_coupler'.bncPort_b;
                #pdu_link interface telecomSubsystem.transceiver.'1553_Port_Stack_x'.p3_b
                    to '1553_coupler'.bncPort_c;
                
                #pdu_link interface  avionicsSubsystem.packetPort to telecomSubsystem.packetPort{
                    message of tp:Thermal_Packet from avionicsSubsystem.packetPort.space_Packet
                        to telecomSubsystem.packetPort.space_Packet;
                }
                #pdu_link interface avionicsSubsystem.onBoardComputer.'c&dh sw'.p3.pktXfer.p2 to telecomSubsystem.transceiver.communication_SW.p3.pktXfer.p2;                
                #pdu_link interface avionicsSubsystem.onBoardComputer.'c&dh sw'.p3.tcp.p2 to telecomSubsystem.transceiver.communication_SW.p3.tcp.p2;                  
                #pdu_link interface avionicsSubsystem.onBoardComputer.'c&dh sw'.p3.ip.p2 to telecomSubsystem.transceiver.communication_SW.p3.ip.p2; 
                
                #pdu_link interface avionicsSubsystem.onBoardComputer.'1553_Port_Stack_x'.p1_b
                    to telecomSubsystem.transceiver.'1553_Port_Stack_x'.p1_b;
            }
        }
    }
    package MissionConfiguration{
        private import Spacecraft_with_Bus::PartsTree::*;
        package Context{
            package PartsTree{
                part mission_Context:Mission_Context{
                    part user1:User1;
                    part target:Target;
                    part mission_Enterprise:Mission_Enterprise{
                        part spacecraft:>spacecraft_Physical;
                        part wan:WAN;
                        part moc:MOC{
                            part telemetry_Processor:Telemetry_Processor;
                            part packet_Processor_Receive:Packet_Processor_Receive;
                            part display:Display;
                            part sle_gw_2:SLE_Gateway;
                        }
                        part space_Link_Terminal:Space_Link_Terminal{
                            part antenna:Antenna;
                            part receiver:Receiver{
                                part detector:Detector;
                                part amplifier:Amplifier;
                                part digital_Decoder:Digital_Decoder;
                            }
                            part sle_gw_1:SLE_Gateway;   
                        }
                        connect space_Link_Terminal.antenna.p1 to spacecraft.telecomSubsystem.high_Rate_Antenna.p2;
                    }
                }
            }
        }
    }
    
    package ViewsAndViewpoints{
        package RASDS_ViewpointDefinitions{
            private import ConcernDefinitions::*;
            viewpoint def EnterpriseViewpoint1{
                frame concern businessConcerns{
                    doc /*xyz*/
                    //stakeholder csa:CSA;  only concern def has stakeholder
                }
            }
            part def CSA;
            viewpoint def EnterpriseViewpoint{
                frame concern businessConcerns:BusinessConcerns;
            }
            viewpoint def FunctionalViewpoint{
                frame concern cc:ComputationalConcerns;
            }
            viewpoint def PhysicalViewpoint{
                frame concern pc:PhysicalConcerns;
            }
            viewpoint def CommunicationsViewpoint{
                frame concern pc:ProtocolConcerns;
            }
            viewpoint def InformationViewpoint{
                frame concern dc:DataConcerns;
            }
            viewpoint def ServicesViewpoint{
                frame concern ssc:SystemServiceConcerns;
            }
            viewpoint def OperationsViewpoint{
                frame concern oc:OperationsConcerns;
            }
            package ConcernDefinitions{
                private import StakeholderDefinitions::*;
                concern def BusinessConcerns {
                    doc /* capabilities, organizations, and governance */
                    stakeholder csa:CommunicationSystemArchitect;
                }
                concern def ComputationalConcerns {
                    doc /* functional decomposition */
                    stakeholder csa:CommunicationSystemArchitect;
                }
                concern def PhysicalConcerns {
                    doc /* component and connector perspective */
                    stakeholder csa:CommunicationSystemArchitect;
                }
                concern def ProtocolConcerns {
                    doc /* communication stack perspective */
                    stakeholder csa:CommunicationSystemArchitect;
                }
                concern def DataConcerns {
                    doc /* relationships and transformation */
                    stakeholder csa:CommunicationSystemArchitect;
                }
                concern def SystemServiceConcerns {
                    doc /* interface, protocols, and datat excchanged */
                    stakeholder csa:CommunicationSystemArchitect;
                }
                concern def OperationsConcerns {
                    doc /* processes, activities, products */
                    stakeholder csa:CommunicationSystemArchitect;
                }
            }
            package StakeholderDefinitions{
                part def CommunicationSystemArchitect; 
            }
        
            part def SafetyEngineer;
            concern def VehicleSafety {
                doc /* identify system safety features */
                stakeholder se:SafetyEngineer;
            }
        }
        package ViewDefinitions{
            //private import Views to access rendering method library 
            private import Views::*;
            view def TreeView{
                render asTreeDiagram;
            }
            view def NestedView; 
            view def RelationshipView;
            view def TableView;
            view def PartsTreeView:>TreeView {
                // include query expression;
                filter @SysML::PartUsage;
                //filter @SysML::ActionUsage;
                //filter @SysML::PartUsage and @SysML::ActionUsage               
                filter not SysML::Element::isLibraryElement;  // this avoids rendering library elements
                /*
                view attributes[*]{
                }*/
            }
            view def PartsInterconnection:>NestedView;
        }
        package RASDS_Views{
            private import RASDS_ViewpointDefinitions::*;
            private import ViewDefinitions::*;
            private import Spacecraft::PartsTree::*;
            view spacecraft_Physical_View:PartsTreeView{
                satisfy requirement pv:PhysicalViewpoint;
                expose spacecraft_Physical::**;
                filter @Security;
                //filter @Safety;
            }
            // use the following command to visaulize this view
            // %view InterfaceModel::ViewsAndViewpoints::RASDS_Views::spacecraft_Physical_View
            
            //The following is an example of applying metadata to suupport view filtering per filter expression above
            //metadata def Safety {
                //attribute isMandatory : Boolean;
            //}
            
            }    
    }

    package DataFieldsModel_gmeador_2024_10_27{
        package Message2Evolution{
            package <MS2U> MessageStructure2Unpacked{
                //private import SequenceFunctions::*; // used for size function // HPdK: Unnecessary since com.meadortech.DataFields already imports SequenceFunctions::*
                private import 'com.meadortech.DataFields'::*;
                private import IntegerFunctions::ToInteger;
                //private import IntegerFunctions::ToNatural;  // added per Hans Peter on 10/27/24

                // alias PCF for PackedCompositeField;
                // alias PF  for PackedField;
                // alias CF  for CompositeField;

                requirement 'CCSDS 133.0-B-1';
                allocate 'CCSDS 133.0-B-1' to spacePacket;

                comment 
                    about SpacePacket, spacePacket
                    /* Re-factored these two items from the original spacePacket in SAF's model 
                     * 
                     * */

                abstract item def SpacePacket :> CF{
                    :>> subFields : CF [2] ordered nonunique = (packetPrimaryHeader, packetDataField);
                    item packetPrimaryHeader [1] : CF :> subFields{
                        :>> subFields [4] ordered nonunique = 
                            (packetVersionNumber, packetIdentification, packetSequenceControl, packetDataLength);
                        item packetVersionNumber [1] : Field :> subFields {
                            :>> value : Natural default 0 {
                                assert constraint valueRange { 0 <= value and value <= 7}
                            }
                        }
                        item packetIdentification [1] : CF :> subFields{
                            :>> subFields [3] ordered nonunique = 
                                (packetType, 
                                 secondaryHeaderFlag, 
                                 applicationProcessIdentifier
                                );
                            item packetType [1]                   : BitField :> subFields;
                            item secondaryHeaderFlag [1]          : BitField :> subFields;
                            item applicationProcessIdentifier [1] : Field    :> subFields{ 
                                :>> value : Natural{
                                    assert constraint checkValueRange{
                                        0 <= value and value <= (2^11 - 1)
                                        // 2^11 - 1 = ToInteger("0b11111111111")
                                    }
                                }
                            } 
                        }
                        item packetSequenceControl [1] : CF :> subFields{
                            :>> subFields : CF [2] ordered nonunique = (sequenceFlags, packetSequenceCount);
                            item sequenceFlags [1] : Field :> subFields{
                                :>> value : Natural;
                                assert constraint checkValueRange{0 <= value and value < 2^2 - 1}
                            }
                            item packetSequenceCount [1] : Field :> subFields{
                                :>> value : Natural;
                                assert constraint checkValueRange{0 <= value and value < 2^14 - 1}
                            }
                        }
                        item packetDataLength [1] : Natural16Field :> subFields;
                    } 
                    item packetDataField [1] : CF :> subFields{
                        :>> subFields : Field [2] ordered nonunique = (packetSecondaryHeader, userDataField);
                        item packetSecondaryHeader [1] : Field :> subFields;
                        item userDataField [1]         : Field :> subFields;
                    }

                    satisfy 'CCSDS 133.0-B-1'; // Added
                } //SpacePacket

                abstract item spacePacket : SpacePacket; // note type refactored from original approach


                item '0b11' : PackedBitField {
                    :>> value : Natural = ToInteger("0b11"); // temporary place holder until binary number notation 0b11 = 2^1 + 1 is available
                    //:>> value : Natural = ToNatural("0b11"); // added by Hans Peter on 10/24/24
                    :> fieldSize = 2 [bit];
                    :> minSizePacked = 2 [bit];    
                }


                item def ThermalPacket specializes SpacePacket{
                    item thermalPacketPrimaryHeader [1] :>> packetPrimaryHeader{
                        :>> packetIdentification {
                            :>> packetVersionNumber.value          = 0;
                            :>> packetType.value                   = 0;
                            :>> secondaryHeaderFlag.value          = 1;
                            :>> applicationProcessIdentifier.value = ToInteger("0x37"); // temporary place holder until hexadecimal number notation 0x37 = 3*16^1 + 7 is available
                            //:>> applicationProcessIdentifier.value = ToNatural("0x37"); // added per Hans Peter on 10/27/24
                        }
                    } 
                    item thermalPacketDataField [1] :>> packetDataField {
                        :>> packetSecondaryHeader {
                            :>> subFields : PF [2] ordered nonunique = (packetTimeStamp,telemetryPacketType);
                            item packetTimeStamp     : Field [1] :> subFields;
                            item telemetryPacketType : OctetField [1] :> subFields;
                        }
                        :>> userDataField {
                            :>> subFields : PF [2] = (timeStamp, temperature);
                            item timeStamp   : TimeStamp [1]   :> subFields; 
                            item temperature : Temperature [1] :> subFields;

                            item def TimeStamp :> Field;
                            item def Temperature :> Field;
                        }
                    }
                }

                item thermalPackets [*] : ThermalPacket;

            }
            package MessageStructure2Packed{
                //public import SequenceFunctions::*; // used for size function
                public import 'com.meadortech.DataFields'::*;
                public import MessageStructure2Unpacked::*;
                private import IntegerFunctions::ToInteger;
                //private import IntegerFunctions::ToNatural;  // added per Hans Peter on 10/27/24

                // alias MS2U for MessageStructure2Unpacked;

                requirement 'CCSDS 133.0-B-1';
                allocate 'CCSDS 133.0-B-1' to spacePacket;

                abstract item def SpacePacket :> MS2U::SpacePacket{
                    :>> packetPrimaryHeader{
                        :>> encOffset =  0 [bit];
                        :>> fieldSize = 48 [bit];
                        :>> packetVersionNumber{
                            :>> encOffset = 0 [bit];
                            :>> fieldSize = 3 [bit]; 
                        }
                        :>> packetIdentification{
                            :>> encOffset = packetVersionNumber.fieldSize;
                            :>> minSizePacked = 13 [bit];
                            :>> fieldSize = 13 [bit]; 
                            :>> packetType {:>> encOffset = 0 [bit];} 
                            :>> secondaryHeaderFlag{:>> encOffset = 1 [bit];} 
                            :>> applicationProcessIdentifier{ 
                                :>> encOffset     =  2 [bit];
                                :>> minSizePacked = 11 [bit];
                                :>> fieldSize= 11 [bit];
                            } 
                        }
                        :>> packetSequenceControl{
                            :>> encOffset = packetIdentification.encOffset + packetIdentification.fieldSize;
                            :>> fieldSize = 16 [bit];
                            :>> sequenceFlags{
                                :>> encOffset = 0 [bit];
                                :>> fieldSize = 2 [bit];
                                :>> minSizePacked = 2 [bit]; // needed because value has a range check
                            }
                            :>> packetSequenceCount{
                                :>> encOffset = sequenceFlags.fieldSize;
                                :>> fieldSize = 14 [bit];
                                :>> minSizePacked = 14 [bit];// needed because value has a range check
                            }
                        }
                        :>> packetDataLength{
                            :>> encOffset = packetSequenceControl.encOffset
                                + packetSequenceControl.fieldSize;                
                        }
                    } 
                    :>> packetDataField{
                        :>> encOffset = packetPrimaryHeader.fieldSize;
                        :>> packetSecondaryHeader{:>> minSizePacked default 8 [bit];}
                        :>> userDataField{:>> minSizePacked default 8 [bit];}

                        attribute maxPacketDataFieldSize [1] : StorageCapacityValue = 65536 [bit];

                        assert constraint checkMaxPacketDataFieldSize {
                            maxPacketDataFieldSize >= sum(subFields.fieldSize)
                        }
                        assert constraint checkMinPacketDataFieldSize {
                            fieldSize >= 16 [bit]
                        }
                    }

                } //SpacePacket

                abstract item spacePacket : SpacePacket; // note type refactored from original approach


                item '0b11' : PackedBitField {
                    :>> value : Natural = ToInteger("0b11");
                    //:>> value : Natural = ToNatural("0b11");  // added per Hans Peter on 10/27/24
                    :> fieldSize = 2 [bit];
                    :> minSizePacked = 2 [bit];    
                }


                item def ThermalPacket specializes MS2U::ThermalPacket, SpacePacket{
                    :>> thermalPacketDataField{
                        :>> packetSecondaryHeader {
                            :>> fieldSize     = packetTimeStamp.fieldSize + telemetryPacketType.fieldSize;
                            :>> minSizePacked = fieldSize;
                            :>> packetTimeStamp{:> fieldSize = 6 * 8 [bit];}
                        }
                        :>> userDataField {
                            :>> encOffset = packetSecondaryHeader.fieldSize;
                            :>> fieldSize = 5 * 8 [bit];
                            :>> timeStamp : PackedTimeStamp [1]; 
                            :>> temperature : PackedTemperature [1];

                            item def PackedTimeStamp specializes TimeStamp, MultiOctetField{
                                :>> fieldSizeInOctets = 3;
                            }
                            item def PackedTemperature specializes Temperature, MultiOctetField{
                                :>> fieldSizeInOctets = 2;
                            }
                        }
                    }
                }

                item thermalPackets [*] : ThermalPacket;

            }

        }
        package MessageStructure2{
            //public import SequenceFunctions::*; // used for size function
            public import 'com.meadortech.DataFields'::*;
            private import IntegerFunctions::ToInteger;
            //private import IntegerFunctions::ToNatural;  // added per Hans Peter on 10/27/24

            // alias PCF for PackedCompositeField;
            // alias PF  for PackedField;

            requirement 'CCSDS 133.0-B-1';
            allocate 'CCSDS 133.0-B-1' to spacePacket;

            comment 
                about SpacePacket, spacePacket
                /* Re-factored these two items from the original spacePacket in SAF's model 
                 * 
                 * */
            abstract item def SpacePacket :> PCF{
                :>> subFields : PCF [2] ordered nonunique = (packetPrimaryHeader, packetDataField);
                item packetPrimaryHeader [1] : PCF :> subFields{
                    :>> encOffset =  0 [bit];
                    :>> fieldSize = 48 [bit];
                    :>> subFields [4] ordered nonunique = 
                        (packetVersionNumber, packetIdentification, packetSequenceControl, packetDataLength);
                    item packetVersionNumber [1] : PF :> subFields {
                        :>> encOffset = 0 [bit];
                        :>> fieldSize = 3 [bit]; 
                        :>> value : Natural default 0 {
                            assert constraint valueRange { 0 <= value and value <= 7}
                        }
                    }
                    item packetIdentification [1] : PCF :> subFields{
                        :>> encOffset = packetVersionNumber.fieldSize;
                        :>> minSizePacked = 13 [bit];
                        :>> fieldSize = 13 [bit]; 
                        :>> subFields [3] ordered nonunique = 
                            (packetType, 
                             secondaryHeaderFlag, 
                             applicationProcessIdentifier
                            );
                        item packetType [1] : PackedBitField :> subFields{ 
                                :>> encOffset = 0 [bit];
                            } 
                        item secondaryHeaderFlag [1] : PackedBitField :> subFields{ 
                            :>> encOffset = 1 [bit];
                        } 
                        item applicationProcessIdentifier [1] : PF :> subFields{ 
                            :>> encOffset     =  2 [bit];
                            :>> minSizePacked = 11 [bit];
                            :>> fieldSize= 11 [bit];
                            :>> value : Natural{
                                assert constraint checkValueRange{
                                    0 <= value and value <= (2^(minSizePacked.num) - 1)
                                }
                            }
                        } 
                    }
                    item packetSequenceControl [1] : PCF :> subFields{
                        :>> encOffset = packetIdentification.encOffset + packetIdentification.fieldSize;
                        :>> fieldSize = 16 [bit];
                        :>> subFields : PF [2] ordered nonunique = (sequenceFlags, packetSequenceCount);
                        item sequenceFlags [1] : PF :> subFields{
                            :>> encOffset = 0 [bit];
                            :>> fieldSize = 2 [bit];
                            :>> minSizePacked = 2 [bit]; // needed because value has a range check
                            :>> value : Natural;
                            assert constraint checkValueRange{
                                0 <= value and value < 2^(minSizePacked.num)-1 and minSizePacked > 0 [bit]
                            }
                        }
                        item packetSequenceCount [1] : PF :> subFields{
                            :>> encOffset = sequenceFlags.fieldSize;
                            :>> fieldSize = 14 [bit];
                            :>> minSizePacked = 14 [bit];// needed because value has a range check
                            :>> value : Natural;
                            assert constraint checkValueRange{
                                0 <= value and value < 2^(minSizePacked.num)-1 and minSizePacked > 0 [bit]
                            }
                        }
                    }
                    item packetDataLength [1] : Natural16PackedField :> subFields{
                        :>> encOffset = packetSequenceControl.encOffset
                            + packetSequenceControl.fieldSize;                
                    }
                } 
                item packetDataField [1] : PCF :> subFields{
                    :>> encOffset = packetPrimaryHeader.fieldSize;
                    :>> subFields : PF [2] ordered nonunique = (packetSecondaryHeader, userDataField);
                    item packetSecondaryHeader [1] : PF :> subFields{
                        :>> minSizePacked default 8 [bit];
                    }

                    item userDataField [1] : PF :> subFields{
                        :>> minSizePacked default 8 [bit];
                    }

                    attribute maxPacketDataFieldSize [1] : StorageCapacityValue = 65536 [bit];

                    assert constraint checkMaxPacketDataFieldSize {
                        maxPacketDataFieldSize >= sum(subFields.fieldSize)
                    }
                    assert constraint checkMinPacketDataFieldSize {
                        fieldSize >= 16 [bit]
                    }
                }

                satisfy 'CCSDS 133.0-B-1'; // Added
            } //SpacePacket

            abstract item spacePacket : SpacePacket; // note type refactored from original approach


            item '0b11' : PackedBitField {
                :>> value : Natural = ToInteger("0b11");
                //:>> value : Natural = ToNatural("0b11");// added per Hans Peter on 10/27/24
                :> fieldSize = 2 [bit];
                :> minSizePacked = 2 [bit];    
            }


            item def ThermalPacket specializes SpacePacket{
                item thermalPacketPrimaryHeader [1] :>> packetPrimaryHeader{
                    :>> packetIdentification {
                        :>> packetVersionNumber.value          = 0;
                        :>> packetType.value                   = 0;
                        :>> secondaryHeaderFlag.value          = 1;
                        :>> applicationProcessIdentifier.value = ToInteger("0x37");
                        //:>> applicationProcessIdentifier.value = ToNatural("0x37");// added per Hans Peter on 10/27/24
                    }
                } 
                item thermalPacketDataField [1] :>> packetDataField {
                    :>> packetSecondaryHeader {
                        :>> fieldSize     = packetTimeStamp.fieldSize + telemetryPacketType.fieldSize;
                        :>> minSizePacked = fieldSize;
                        :>> subFields : PF [2] ordered nonunique = (packetTimeStamp,telemetryPacketType);
                        item packetTimeStamp : PF [1] :> subFields{
                            :> fieldSize = 6 * 8 [bit];
                        }
                        item telemetryPacketType : OctetField [1] :> subFields;
                    }
                    :>> userDataField {
                        :>> encOffset = packetSecondaryHeader.fieldSize;
                        :>> fieldSize = 5 * 8 [bit];
                        :>> subFields : PF [2] = (timeStamp, temperature);
                        item timeStamp : TimeStamp [1] :> subFields; 
                        item temperature : Temperature [1] :> subFields;

                        item def TimeStamp specializes MultiOctetField{
                            :>> fieldSizeInOctets = 3;
                        }
                        item def Temperature specializes MultiOctetField{
                            :>> fieldSizeInOctets = 2;
                        }
                    }
                }
            }

            item thermalPackets [*] : ThermalPacket;

        }
        package 'com.meadortech.DataFields' {
        // This file © 2024 by Guy Meador is licensed under Apache-2.0
        // # To view a copy of this license, visit https://spdx.org/licenses/Apache-2.0.html
        // SPDX-License-Identifier: Apache-2.0
            
        doc 
        /* 
         * This package © 2024 by Guy Meador is licensed under Apache-2.0
         * To view a copy of this license, visit https://spdx.org/licenses/Apache-2.0.html
         * SPDX-License-Identifier: Apache-2.0
         */    
        
        public import ISQ::StorageCapacityValue;
        public import SI::bit; // for def of bit as a unit of storage
        public import ScalarValues::*;
        public import SequenceFunctions::*;
        public import NumericalFunctions::*;
    
    
        attribute def Bit :> Natural { 
            doc 
                /* A fundamental definition of the range of a classical bit = 0..1 */

            assert constraint checkBitRange {0 <= that and that <=1}
                comment about checkBitRange
                    /* The checkBitRange constraint ensures that any usage of Bit conforms
                     * to the value range 0..1 . The constraint uses 'that' which is a feature
                     * defined in Base.kerml 
                     */
        }
    
        abstract item def Field{
            //      The following doc is commented out so that the PlantUML rendering in Eclipse
            //      does not take up lots of space on the diagrams
            //
            // doc
                //* 
                 * Field classifies data type usages that may have a value, may consume
                 * storage capacity (conventionally measured in bits), and may have
                 * sub-fields whose storage are wholly contained within the Field's storage.
                 * 
                 * The storage of subfields does not overlap with each other.
                 * 
                 * Fields may be packed (isPacked=true), meaning they have
                 * a definite fieldSize that is at least minSizePacked.
                 * 
                 * If a field is packed, then all of its subfields must also be packed.
                 * 
                 * SubFields may be positioned at non-overlapping definite offsets and extents
                 * within the field's storage. All subFields of a packed field are packed as well.
                 * 
                 * The logical ordering of subFields and the ordering of the storage of subFields
                 * within the enclosing field's storage are the same.
                 * 
                 * Bit ordering within a field's storage is 'Big Endian' TBD need to refine this def
                 * 
                 * The area of the field's storage associated with the value may be smaller than
                 * the size of the field. This area may be optionally defined by the offset
                 * attributes fieldInternalOffset and fieldInternalLastOffset which are offsets
                 * referenced from the lowest bit index value for the field's storage.
                 * 
                 * ┌───────────────────────────────────────────────┐    
                 * │          Bit Array Model for Storage          │    
                 * └───────────────────────────────────────────────┘    
                 * ┌───────────────────────────────────────────────┐    
                 * │                         1111111111222222222233│    
                 * │  Bit Offset   01234567890123456789012345678901│    
                 * │              ┌────────────────────────────────┤    
                 * │             0│A.........B.....................│    
                 * │            32│................................│    
                 * │            64│C...............................│    
                 * │            96│...............................D│    
                 * └──────────────┴────────────────────────────────┘    
                 *                                                      
                 *                                                      
                 *  StorageSize = 128 bit                        
                 *  Bit Offsets                                         
                 *  -----------                                         
                 *  A =  0                                              
                 *  B = 10                                              
                 *  C = 64                                              
                 *  D = 127                                             
                 * 
                 * 
     ┌───────────────────────────────┐           
     │    Field Storage Example 1    │           
     └───────────────────────────────┘           
     ┌───────────────────────────────┐           
     │                         111111│           
     │  Bit Offset   0123456789012345│           
     │              ┌────────────────┤           
     │             0│........VVVVVVVV│           
     └──────────────┴────────▲──────▲┘           
                             │      │            
      ┌──────────────────────┴─┐    │            
      │fieldInternalOffset = 8 │    │            
      └────────────────────────┘    │            
             ┌──────────────────────┴─────┐      
             │fieldInternalLastOffset = 15│      
             └────────────────────────────┘      

      VVVVVVVV represents bit indexes            
      associated with the field value            

      Other Field Attributes                     
      ----------------------                     
      fieldSize = 16 [bit]                       
      isPacked = true                            
      minSizePacked = 8 [bit]                    

      Note: Unused storage at index values 0..7  



      ┌───────────────────────────────┐          
      │    Field Storage Example 2    │          
      └───────────────────────────────┘          
      ┌───────────────────────┐                  
      │                       │                  
      │  Bit Offset   01234567│                  
      │              ┌────────┤                  
      │             0│VVVVVVVV│                  
      └──────────────┴▲──────▲┘                  
                      │      └────┐              
       ┌──────────────┴─────────┐ │              
       │fieldInternalOffset = 0 │ │              
       └────────────────────────┘ │              
              ┌───────────────────┴────────┐     
              │fieldInternalLastOffset = 7 │     
              └────────────────────────────┘     

       VVVVVVVV represents bit indexes           
       associated with the field value           

       Other Field Attributes                    
       ----------------------                    
       fieldSize = 8 [bit]                       
       isPacked = true                           
       minSizePacked = 8 [bit]                   

       Note: No unused storage                   

                 * 
                 */


            //// Begin Field Attributes

            attribute value [0..1]{
                doc 
                    /* Represents the data value for the field:
                     * - Intended to be redefined in the non-abstract specialization of Field.
                     * - Fields with an empty value can be used to represent storage capacity
                     *   without defining a specific idea of the value being stored; 
                     *   they can also be used to collect together subFields.
                     * - Composite fields (see below) may or may not have a value depending on 
                     *   the need.
                     */
            }
            attribute fieldSize : StorageCapacityValue [0..1]{
                doc
                    /* Represents the storage size of the field (nominally expressed in units of bit
                     * as defined in the SI package): 
                     * - An empty fieldSize indicates no field size is specified.
                     * - A zero fieldSize indicates the field does not take up storage, which is illegal.
                     * - If the the Field isPacked then fieldSize must have a value
                     */    

                assert constraint checkExtantFieldSizeIsNonZero{ 
                    notEmpty(fieldSize)  implies fieldSize > 0 [bit]
                }
            }

            attribute maxFieldSize : StorageCapacityValue [0..1]{
                doc
                    /* Represents the maximum size the field may have in any context.
                     * - An empty maxFieldSize indicates no size is specified.
                     * - A zero maxFieldSize indicates the field does not take up storage, which is illegal.
                     * - If the Field isPacked then maxFieldSize may or may not have a value.
                     */

                assert constraint checkExtantMaxFieldSizeIsNonZero{ 
                    notEmpty(maxFieldSize)  implies maxFieldSize > 0 [bit]
                }

            }

            //
            // Packing
            //

            attribute isPacked : Boolean default := false{
                doc 
                /* Indicates if the representation of the field within storage
                 * is specified with regard to actual fieldSize and possibly minimum field size,
                 */
            }

            attribute minSizePacked : StorageCapacityValue [0..1] {
                doc /* The minimum field size in storage units of bits necessary for the field */
            }

            attribute <fldIntOfs> fieldInternalOffset : StorageCapacityValue [1] default 0 [bit]{            
                doc /* Bit offset within the field's storage for the first bit associated with the value */
            }

            attribute <fldIntLastOfs> fieldInternalLastOffset : StorageCapacityValue [0..1]{
                doc
                    /* Bit offset within the field's storage for the last bit associated with the value.
                     * 
                     */
            }
            assert constraint CheckFldIntLastOfs {
                notEmpty (fldIntLastOfs)
                    implies 
                        notEmpty (fldIntOfs)
                        and fldIntOfs <= fldIntLastOfs

            }

            assert constraint checkPackedHasDefiniteSize   {isPacked implies notEmpty(fieldSize)}
            //assert constraint checkPackedHasMinPackedSize  {isPacked             implies notEmpty(minSizePacked)}
            // assert constraint checkExtantValueAndSizeAreExact
    //        assert constraint checkExtantValueAndSizeIsCompatible{
    //            notEmpty(value) and notEmpty(fieldSize)
    //            implies
    //            fieldSize >= (...bits required to store value...)
    //        }

            //
            // As a subfield
            //
            // Time will tell if these are truly needed for specifying composite data fields
            // or if an approach that stores the information in the superField is more appropriate
            // or if these are not needed at all

            ref item <encField> enclosingField : Field [0..1] {
                doc
                    /* The field for which this field is a subField.
                     * e.g. this field's outer, containing field (if any)
                     */
            }

            attribute <encFldIdx> enclosingFieldSubfieldIndex : Natural [0..1] {
                doc
                    /* The enclosing field's index value for this field within the enclosing
                     * field's ordered collection of subFields.
                     */
            }

            attribute <encOffset> enclosingStorageOffset : StorageCapacityValue [0..1]{
                doc
                    /* The offset of the beginning of this field's storage
                     * within the enclosing field's storage.
                     */
            }


            //
            // With Sub Fields
            //

            item subFields : Field[*] ordered nonunique;

            // TODO Add automatic setting of subfield superfield ref, index and offsets        

            // Uncertain if spatial extent is necessary
            //        redefines innerSpaceDimension : Natural = 1;
            //        redefines outerSpaceDimension : Natural = 1;
                }

            abstract item def <PF> PackedField specializes Field{
                :>> isPacked = true;
            }

            abstract item def <CF> CompositeField specializes Field{
                :>> subFields : Field[1..*] ordered nonunique;
                derived attribute redefines fieldSize default := sum(subFields.fieldSize); 
            }

            abstract item def <PCF> PackedCompositeField specializes CompositeField, PackedField{
                doc
                    /* 
                     * All subfields are adjacent
                     * */

                redefines subFields : PackedField [1..*] ordered nonunique;

                assert constraint checkPackedCompositeFieldSize{
                    fieldSize == sum(subFields.fieldSize)
                }

            }

            item def BitField :> Field {
                redefines value : Bit default 0;
                redefines minSizePacked = 1 [bit];
                redefines subFields [0];
            }

            item def PackedBitField specializes BitField{
                redefines fieldSize = 1 [bit];
            }

            item def OctetField specializes PackedField{
                redefines maxFieldSize = 8 [bit];
                redefines minSizePacked = 8 [bit];
                redefines fieldSize = 8 [bit];
            }

            abstract item def MultiOctetField specializes PackedField{
                attribute fieldSizeInOctets : Natural default 1;
                redefines maxFieldSize = fieldSizeInOctets * 8 [bit];
                redefines minSizePacked = maxFieldSize;
                redefines fieldSize = maxFieldSize;
            }

            attribute def Natural16 specializes Natural{
                assert constraint checkRange {0 <= that and that <= (2^16 - 1)}
                    comment about checkRange
                        /* The checkRange constraint ensures that any usage of this type conforms
                         * to the value range 0..65535 . The constraint uses 'that' which is a feature
                         * defined in Base.kerml 
                         */

            }

            item def Natural16Field :> Field{
                :>> value : Natural16 default 0;
            }

            item def Natural16PackedField :> Natural16Field, PackedField{
                redefines maxFieldSize = 16 [bit];
                redefines minSizePacked = 16 [bit];
                redefines fieldSize = 16 [bit];
            }

        }
    }
}
