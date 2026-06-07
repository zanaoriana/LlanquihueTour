markdown# 🧠 Semana 3 – Desarrollo Orientado a Objetos I

## 👤 Autora del proyecto
- **Nombre completo:** [Oriana Navarrete]
- **Sección:** [Online]
- **Carrera:** Analista Programador
- **Sede:** [online]

---

## 📘 Descripción general del sistema
Sistema orientado a objetos desarrollado en Java que modela las personas vinculadas a la agencia de turismo **Llanquihue Tour**. Aplica los principios de encapsulamiento, composición y herencia para representar clientes y empleados de la agencia.

---

## 🧱 Estructura del proyecto
📁 src/
├── app/        # Clase principal Main
└── model/      # Clases Direccion, Persona y Empleado

### Clases implementadas
- **Direccion** → clase de composición (calle, número, ciudad)
- **Persona** → clase base con composición de Direccion
- **Empleado** → hereda de Persona, agrega cargo y sueldo

### Relaciones
- `Persona` contiene a `Direccion` → **composición**
- `Empleado` extiende a `Persona` → **herencia**

---

## ⚙️ Instrucciones para ejecutar
1. Clona el repositorio:
git clone https://github.com/zanaoriana/LlanquihueTour.git
2. Abre el proyecto en IntelliJ IDEA
3. Ejecuta el archivo `Main.java` desde el paquete `app`

---

**Repositorio GitHub:** https://github.com/zanaoriana/LlanquihueTour  
**Fecha de entrega:** [06/06/2026]

---
© Duoc UC | Escuela de Informática y Telecomunicaciones
