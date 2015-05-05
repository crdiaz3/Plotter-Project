<pre>
 _____   _      ______   _____   _____   _____   _____  
|  _  | | |    |  __  | |_   _| |_   _| |  ___| |  _  \  
| |_| | | |    | |  | |   | |     | |   | |_    | |_| /  
| ____| | |    | |  | |   | |     | |   |  _|   |  _ \  
| |     | |__  | |__| |   | |     | |   | |___  | | \ \  
|_|     |____| |______|   |_|     |_|   |_____| |_|  \_\  
</pre>

TABLE OF CONTENTS
=================
1. Usage
2. Configuration
3. Errors


1. USAGE
--------------
This Plotter program is a simple graphing utility with some additional
calculus abilities. 

### Plot
To plot a function, write it inside one of the `Displayed
Function` boxes.  Then, press the `Draw` button or hit Enter.  Both functions
will be displayed.  Supported functions are located below in the ERRORS
section of the README.

### Derivative
To plot the first function's derivative, click the `Show DF` button.  To
disable the derivative, click the `No DF` button.

### Integral
To calculate the integral of the first function, click the `Integral (y1)`
button to open the integral dialogue box.  Then, chose your limits and the
method of calculation, then hit the `Recalculate` button.

### Coordinate Switching
Press the `Visualization` button and select your preferred coordinate system:
Cartesian 2D, Polar 2D, or Cartesian 3D.  The view will then change.


2. CONFIGURATION
----------------
Most of the customization comes in the form of color options, which can be
located in the `Colors -> change Colors` menu.  Then, to change a color, click
the `>` button next to the name.  You can then select a color using Swatches,
Hue Saturation Value(HSV), Hue Saturation Lightness(HSL), Red Green Blue(RGB),
or Cyan Magenta Yellow Black(CMYK).

`BACKGROUND_COLOR` is the color of the graph background  
`PANEL_COLOR` is the color of the area around the graph  
`LINE_COLOR` is the color of the lines for function 1 (and 2 for Cartesian 2D)  
`LINE_2_COLOR` is the color of the derivative of function 1  
`AXIS_COLOR is` the color of the axis and numbers  
`LINE_3D_COLOR` is the color of the 3D shape displayed, recommended light color  


3. ERRORS
---------

Most of the errors should be obvious: things like invalid functions, just a
negative sign as an input or the range.  Below is a list of valid functions
that can be used.

- `sqrt(x)`
- `sin(x)`
- `cos(x)`
- `tan(x)`
- `exp(x)`
- `log(x)`
- `ln(x)`
- `abs(x)`
- `asin(x)`
- `acos(x)`
- `atan(x)`
- `sinh(x)`
- `cosh(x)`
- `tanh(x)`
