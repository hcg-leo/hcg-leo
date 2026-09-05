### github stats

[![Metrics](https://github.com/hcg-leo/hcg-leo/raw/main/github-metrics.svg)](https://github.com/hcg-leo/hcg-leo/blob/main/github-metrics.svg)

### my latest projects
{{ range recentRepos 5 }}
- [{{ .Name }}]({{ .URL }}) - {{ .Description }}
{{- end }}

### recent stars
{{ range recentStars 5 }}
- [{{ .Repo.Name }}]({{ .Repo.URL }}) - {{ .Repo.Description }}
{{- end }}

### how to reach me
- email: aran20111118 [at] gmail [dot] com
- discord: hcg_leo
