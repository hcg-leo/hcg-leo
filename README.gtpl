### my latest projects
{{ range recentRepos 5 }}
- [{{ .Name }}]({{ .URL }}){{ with .Description }} - {{ . }}{{ end }}
{{- end }}

### recent stars
{{ range recentStars 5 }}
- [{{ .Repo.Name }}]({{ .Repo.URL }}){{ with .Repo.Description }} - {{ . }}{{ end }}
{{- end }}

### my recent pull requests
{{ range recentPullRequests 5 }}
- [{{ .Title }}]({{ .URL }}) on [{{ .Repo.Name }}]({{ .Repo.URL }})
{{- end }}

### how to reach me
- discord: hcg_leo

### github stats

![github metrics](github-metrics.svg)
