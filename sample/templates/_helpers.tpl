{{- define "ingress.annotations" }}
annotations:
  kubernetes.io/ingress.class: {{ .Values.application.ingress.controller }}
  {{- if eq .Values.application.ingress.controller "nginx" }}
  nginx.ingress.kubernetes.io/use-regex: 'true'
  nginx.ingress.kubernetes.io/rewrite-target: /$1
  nginx.ingress.kubernetes.io/ssl-redirect: 'false'
  nginx.ingress.kubernetes.io/x-forwarded-prefix: /{{ .Release.Name }}
  {{- end }}
{{- end }}

{{- define "chart.labels" }}
helm.sh/chart: {{ .Chart.Name }}
app.kubernetes.io/name: {{ .Release.Name }}
app.kubernetes.io/version: {{ .Values.application.version }}
app.kubernetes.io/component: {{ .Values.application.type }}
{{- end }}

{{- define "common.labels" }}
environment: {{ .Values.application.environment }}
tier: {{ .Values.application.tier }}
{{- end }}