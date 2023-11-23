# Requirements: pip3 install bokeh

import math
import sys

from bokeh.plotting import figure, output_file, show

f = "salida.txt"
x=[]
y=[]
logx=[]
logy=[]

with open(f) as f:

    for s in f:
        x.append(int(s.split()[0]))
        y.append(float(s.split()[1]))


for i in x:
    logx.append(math.log(i))

for i in y:
    logy.append(math.log(i+0.0000000000000000001))



print ("log(n)", "           log(T(n))")
print ("------", "           ---------")
for i in range(len(logx)):
    print (logx[i], logy[i])

# output to static HTML file
output_file("lines.html")


if sys.argv[1] == "-log":
    # create a new plot with a title and axis labels
    p = figure(title="Análisis de algoritmos", x_axis_label='log(n)', y_axis_label='log(T(n))', x_range=(0,10), y_range=(0,15))#, y_axis_type="log")
    # add a line renderer with legend and line thickness
    p.circle(logx, logy, legend_label="log(T(n))", line_width=2)

elif sys.argv[1] == "-normal":
    # create a new plot with a title and axis labels
    p = figure(title="Análisis de algoritmos", x_axis_label='n', y_axis_label='T(n)', x_range=(0,64000), y_range=(0,9000))
    # add a line renderer with legend and line thickness
    p.circle(x, y, legend_label="T(n)", line_width=2)


# show the results
show(p)
