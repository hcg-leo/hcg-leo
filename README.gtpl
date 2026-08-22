<p align="center">
  <img src="https://capsule-render.vercel.app/api?type=waving&color=gradient&height=200&section=header&text=hcg-leo&fontSize=60&fontAlignY=35&animation=fadeIn&desc=Welcome%20to%20my%20GitHub%20profile&descAlignY=55&descSize=18" alt="Header banner" />
</p>

### GitHub Stats

[![Metrics](https://github.com/hcg-leo/hcg-leo/raw/main/github-metrics.svg)](https://github.com/hcg-leo/hcg-leo/blob/main/github-metrics.svg)

### 👷 Check out what I'm currently working on
{{ range recentContributions 5 }}
- [{{ .Repo.Name }}]({{ .Repo.URL }}) - {{ .Repo.Description }}
{{- end }}

### 🌱 My latest projects
{{ range recentRepos 5 }}
- [{{ .Name }}]({{ .URL }}) - {{ .Description }}
{{- end }}

### 🔨 My recent Pull Requests
{{ range recentPullRequests 5 }}
- [{{ .Title }}]({{ .URL }}) on [{{ .Repo.Name }}]({{ .Repo.URL }})
{{- end }}

### ⭐ Recent Stars
{{ range recentStars 5 }}
- [{{ .Repo.Name }}]({{ .Repo.URL }}) - {{ .Repo.Description }}
{{- end }}

### 📫 How to reach me

<!-- Add your real links here, e.g.:
- Website : <https://example.com>
-->
