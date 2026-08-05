# Implementación de un Microservicio en Kotlin

El equipo de desarrollo de una empresa fintech necesita implementar un microservicio que gestione las solicitudes de préstamo. El microservicio debe integrarse con un sistema de evaluación de riesgos y un sistema de auditoría. El microservicio debe ser capaz de manejar un volumen de 1 500 solicitudes por segundo en hora pico y garantizar la idempotencia de las solicitudes mediante una clave única. Además, debe implementar circuit breakers para manejar fallos temporales en los sistemas externos y proporcionar observabilidad a través de métricas y logs.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | Microservicios con Kotlin |
| **Nivel** | advanced-l1 |
| **Tipo** | practical |
| **Tiempo estimado** | 4 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: JDK 17+, Gradle 8+, IDE con soporte Java.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Ejecuta `gradle build` en la raíz. Si no hay errores, estás listo.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Definición del Microservicio

**Objetivo:** Definir las funcionalidades y restricciones del microservicio.

**Tiempo estimado:** 1 hora

**Instrucciones:**

- Identificar los actores involucrados: originador de créditos, motor antifraude, buró de riesgos, core bancario, gateway de pagos, sistema de liquidación, agente de retención, consolidador contable.
- Establecer las reglas de negocio: prohibición de solicitudes duplicadas, manejo de precios negativos, validación de campos obligatorios.
- Definir los umbrales numéricos: 1 500 solicitudes/segundo en hora pico, idempotencia por número de operación + canal, timeout del buró >2s, respuesta 5xx del core, conexión perdida durante la escritura.

**Entregable:** Documento de diseño que describe las funcionalidades, actores, reglas de negocio y umbrales numéricos del microservicio.

<details>
<summary>Pistas de conocimiento</summary>

- Considera las interacciones entre los diferentes sistemas y cómo se pueden integrar.
- Piensa en los posibles edge cases y cómo manejarlos.

</details>

### Fase 2: Implementación de la Lógica de Negocio

**Objetivo:** Implementar la lógica de negocio del microservicio.

**Tiempo estimado:** 2 horas

**Instrucciones:**

- Desarrollar las funcionalidades para gestionar las solicitudes de préstamo, incluyendo la validación de campos y la prohibición de solicitudes duplicadas.
- Implementar la idempotencia de las solicitudes mediante una clave única.
- Integrar con el sistema de evaluación de riesgos y el sistema de auditoría.

**Entregable:** Código fuente del microservicio que implementa la lógica de negocio, incluyendo la validación de campos, la prohibición de solicitudes duplicadas y la idempotencia de las solicitudes.

<details>
<summary>Pistas de conocimiento</summary>

- Considera cómo manejar los errores y excepciones que puedan ocurrir durante la integración con los sistemas externos.
- Piensa en cómo garantizar la consistencia de los datos entre el microservicio y los sistemas externos.

</details>

### Fase 3: Implementación de Circuit Breakers y Observabilidad

**Objetivo:** Implementar circuit breakers y observabilidad en el microservicio.

**Tiempo estimado:** 1 hora

**Instrucciones:**

- Implementar circuit breakers para manejar fallos temporales en los sistemas externos.
- Configurar métricas y logs para proporcionar observabilidad del microservicio.

**Entregable:** Código fuente del microservicio que implementa circuit breakers y observabilidad, incluyendo métricas y logs.

<details>
<summary>Pistas de conocimiento</summary>

- Considera cómo configurar los circuit breakers para que se activen y desactiven automáticamente en función de la salud de los sistemas externos.
- Piensa en qué métricas y logs son importantes para monitorear la operatividad del microservicio.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué es un microservicio y cuáles son sus principales características?
- **paraQueSirve**: ¿Para qué sirve implementar circuit breakers en un microservicio?
- **comoSeUsa**: ¿Cómo se usa la idempotencia en un microservicio para gestionar solicitudes de préstamo?
- **erroresComunes**: ¿Cuáles son los errores comunes que pueden ocurrir durante la integración de un microservicio con sistemas externos?
- **queDecisionesImplica**: ¿Qué decisiones implica la implementación de observabilidad en un microservicio?

## Criterios de Evaluacion

- Definición clara de las funcionalidades y restricciones del microservicio.
- Implementación correcta de la lógica de negocio, incluyendo la validación de campos y la prohibición de solicitudes duplicadas.
- Implementación correcta de la idempotencia de las solicitudes mediante una clave única.
- Implementación correcta de circuit breakers para manejar fallos temporales en los sistemas externos.
- Configuración correcta de métricas y logs para proporcionar observabilidad del microservicio.

---

*Reto generado automaticamente por Challenge Generator - Pragma*
