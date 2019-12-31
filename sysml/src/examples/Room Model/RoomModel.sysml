// SysML v2 Interpretation of the SysML v1 Room Connection Example
package RoomModel { 
    package RoomDefinitionModelLibrary{
        import Port_Definitions::*;
        import Flow_Definitions::*;
        package Part_Definitions{
            // Rooms
            block Classroom {
                port classEntry: EntryWay_to_Classroom;
            }
            block Storageroom {
                port storageEntry: EntryWay_to_Storageroom;
            }
            block Hallway {
                // conjugate ports with ~
                port hallExit_to_Classroom: ~EntryWay_to_Classroom;
                port hallExit_to_Storageroom: ~EntryWay_to_Storageroom;
            }
        }
        package Port_Definitions{
            port def EntryWay_to_Classroom {
                //flow properties
                ref in student:Student;
                ref in teacher:Teacher;
                ref in furniture:Furniture;
                ref in air:Air;
            }
            port def EntryWay_to_Storageroom {
                //flow properties
                ref in furniture:  Furniture;
                ref in air: Air;
            }
        }
        package Flow_Definitions {
                //  Conveyed items between Hallway, Classroom, and Storageroom
                block Air;
                block Furniture;
                block Student;
                block Teacher;
        }
    }
    package Room_Configuration{
        // defining the parts and their interconnection in context 
        import RoomDefinitionModelLibrary::*;
        import RoomDefinitionModelLibrary::Part_Definitions::*;
        import RoomDefinitionModelLibrary::Port_Definitions::*;
        import RoomDefinitionModelLibrary::Flow_Definitions::*;
        part roomContext{
            part c:Classroom {
            	port classEntry redefines Classroom::classEntry {
	                ref in student redefines Classroom::classEntry::student;
	                ref in teacher redefines Classroom::classEntry::teacher;
	                ref in furniture redefines Classroom::classEntry::furniture;
	                ref in air redefines Classroom::classEntry::air;            		
            	}
            }
            part s:Storageroom {
            	port storageEntry redefines Storageroom::storageEntry{ 
	                ref in furniture redefines Storageroom::storageEntry::furniture;
	                ref in air redefines Storageroom::storageEntry::air;
            	}
            }
            part h:Hallway {
                port hallExit_to_Classroom redefines Hallway::hallExit_to_Classroom {
	                ref out student redefines Hallway::hallExit_to_Classroom::student;
	                ref out teacher redefines Hallway::hallExit_to_Classroom::teacher;
	                ref out furniture redefines Hallway::hallExit_to_Classroom::furniture;
	                ref out air redefines Hallway::hallExit_to_Classroom::air;            		
               }
                port hallExit_to_Storageroom redefines Hallway::hallExit_to_Storageroom {
	                ref out furniture redefines Hallway::hallExit_to_Storageroom::furniture;
	                ref out air redefines Hallway::hallExit_to_Storageroom::air;
                }           	
            }
            
    		//  Connectors and item flows between hallway and classroom
            stream HallToClassroom_Air
                from h::hallExit_to_Classroom::air
                to c::classEntry::air;
            stream HallToClassroom_Furniture
                from h::hallExit_to_Classroom::furniture
                to c::classEntry::furniture;
            stream HallToClassroom_Student
                from h::hallExit_to_Classroom::student
                to c::classEntry::student;
            stream HallToClassroom_Teacher
                from h::hallExit_to_Classroom::teacher
                to c::classEntry::teacher;
            stream HallToStorageroom_Air
                from h::hallExit_to_Storageroom::air
                to s::storageEntry::air;
            stream HallToStorageroom_Furniture
                from h::hallExit_to_Storageroom::furniture
                to s::storageEntry::furniture;
        }
    }
}



