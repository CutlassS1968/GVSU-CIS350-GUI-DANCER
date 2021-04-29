# Overview

This document is meant to establish the requirements of the final product. It goes into detail on what is needed for the Physics Engine, User Input, and Graphics Interface.

# Software Requirements

The first section of this document will be dedicated to Functional Requirements, while the second section will be dedicated to Non-Functional Requirements.
  
  ## Functional Requirements
  
  ### Physics Engine Requirements
  | ID | Physics Engine | 
  | :-------------:| :----------: | 
  | FR1 | Shapes shall move with respect to a physics system implemented through a physics engine class and supporting values. | 
  | FR2 | Shapes shall conform to numerical constraints defined in the main class, and applied to all shapes, such as gravity and drag. | 
  | FR3 | Shapes shall have collisions with frame boundaries. | 
  | FR4 | The PhysicsEngine class shall run as a thread during program execution. |
  | FR5 | The PhysicsEngine class shall use vector and acceleration classes in its calculations. |
  
  ### User Input Requirements
  | ID | User Input | 
  | :-------------:| :----------: |
  | FR6 | Debug statistics shall be turned on or off via mouse click. | 
  | FR7 | Dancing figure shall be turned on or off via mouse click. | 
  | FR8 | Frame boundaries shall be changed with the mouse.  | 
  | FR9 | Program shall stop running when X button clicked via mouse. | 
  | FR10| The User shall be able to select options from a drop down menu at the top of the window. |
  
  ### Graphics Interface Requirements
  | ID | Graphics Interface | 
  | :-------------:| :----------: |
  | FR11| Shapes shall be properly drawn through the use of the 2DGraphics library. | 
  | FR12| Shapes shall be drawn according to their type. | 
  | FR13| Dancing figure shall automatically loop through dance animations. | 
  | FR14| All Entities that need to be drawn shall be stored in an ArrayList. | 
  | FR15| The main loop shall retrieve the user's mouse position and display its coordinates on screen. |
  
  ## Non-Functional Requirements
  
  ### Physics Engine Requirements
  | ID | Physics Engine | 
  | :-------------:| :----------: | 
  | NFR1 | There shall be a physics simulation that the user can observe. | 
  | NFR2 | Objects within the simulation shall be two-dimensional. |
  | NFR3 | Object collision shall result in an updated position for the object. |
  | NFR4 | Shapes shall detect other shapes. | 
  | NFR5 | Aspects of the simulation shall be customizable. |
  
  ### User Input Requirements
  | ID | User Input | 
  | :-------------:| :----------: | 
  | NFR6 | User shall be able to toggle debug stats. | 
  | NFR7 | User shall be able to toggle dancing stick figure. |
  | NFR8 | User shall be able to change frame size. |
  | NFR9 | User shall be able to exit program. | 
  | NFR10 | User shall be able to select options from a drop down menu. |
  
  ### Graphics Interface Requirements
  | ID | Graphics Interface | 
  | :-------------:| :----------: | 
  | NFR11 | Program shall be a GUI. | 
  | NFR12 | Shapes shall be drawn to the GUI. |
  | NFR13 | There shall be a menu drop down in the window for the use to toggle aspects of the application. |
  | NFR14 | Program shall be able to run on any desktop device. | 
  | NFR15 | All shapes shall be the same color. |
  
  # Software Artifacts
  
  This is a collection of all documents and artifacts generated for this project.
  
  ## Use-Cases
  
  [User & Physics Engine](https://github.com/CutlassS1968/GVSU-CIS350-GUI-DANCER/blob/master/artifacts/use_case_diagrams/User%20diagram%20(User%20Input%20System%20to%20Physics%20System).pdf)
  
  [User & Graphics Interface](https://github.com/CutlassS1968/GVSU-CIS350-GUI-DANCER/blob/master/artifacts/use_case_diagrams/user_graphics.pdf)
  
  [Physics Engine & Graphics Interface](https://github.com/CutlassS1968/GVSU-CIS350-GUI-DANCER/blob/master/artifacts/use_case_diagrams/physics_graphics.pdf)
  
  [Physics Engine & Graphics Interface Descriptions](https://github.com/CutlassS1968/GVSU-CIS350-GUI-DANCER/blob/master/artifacts/use_case_diagrams/physics_graphics_description.pdf)
  
  ## Gantt Chart
  
  [GUI Dancer Gantt Chart](https://github.com/CutlassS1968/GVSU-CIS350-GUI-DANCER/blob/master/docs/GUI%20Dancer%20Gantt.pdf)
  
  ## Old Software Secifications
  
  [Software Requirements Specification](https://github.com/CutlassS1968/GVSU-CIS350-GUI-DANCER/blob/master/docs/software_requirements_specification.md)
  
  ## Tasks
  
  [Previous Tasks](https://github.com/CutlassS1968/GVSU-CIS350-GUI-DANCER/blob/master/docs/tasks.md)
  
  ## Proposal
  
  [Original Project Proposal](https://github.com/CutlassS1968/GVSU-CIS350-GUI-DANCER/blob/master/docs/proposal-template.md)
  
  
  ## Meetings
  
  [All meeting notes over the course of the semester](https://github.com/CutlassS1968/GVSU-CIS350-GUI-DANCER/tree/master/meetings)
