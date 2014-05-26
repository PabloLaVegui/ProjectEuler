# Problema 22
#
# Tenemos de un archivo que contiene más de 5000 nombres. Lo primero es
# colocarlos en orden alfabético, luego se resuelve un valor alfabético
# para cada nombre, que se multiplica por su posición en la lista para
# obtener la puntuación del nombre.
#
# Ej. COLIN: 3 + 15 + 12 +9 + 14 = 53
#     COLIN ocupa el lugar 938 en la lista una vez ordenada alfabeticamente
#
#     Puntuación:  938 * 53 = 49714
#
# ¿Cual es el total de todas las puntuaciones en el archivo?
#
# A -> 65 en ascii ("A".ord) ord - 64

arr = File.read("names.txt").split(",").map do |n|
  n.gsub("\"","")
end.sort
# Score
total_score = 0
arr.each_index do |i|
  suma_chars = 0
  arr[i].each_char do |c|
    suma_chars += c.ord - 64
  end
  total_score += suma_chars * (i + 1)
end
puts "score #{total_score}"



