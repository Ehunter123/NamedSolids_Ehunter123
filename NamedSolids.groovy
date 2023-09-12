double size =80
return [
new Dodecahedron(size).toCSG().movex(size*0),
new Icosahedron(size).toCSG().movex(size*10),
new Octahedron(size).toCSG().movex(size*4),
new Tetrahedron(size).toCSG().movex(size*6),

]