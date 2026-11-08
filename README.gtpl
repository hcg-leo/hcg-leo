### hcg-leo

<sub>discord · <code>hcg_leo</code></sub>

<img src="github-metrics.svg" alt="languages and contributions" width="100%">

**projects**
{{ range recentRepos 4 }}
- [{{ .Name }}]({{ .URL }}){{ with .Description }} · <sub>{{ . }}</sub>{{ end }}
{{- end }}

**starred**
{{ range recentStars 4 }}
- [{{ .Repo.Name }}]({{ .Repo.URL }})
{{- end }}

**pull requests**
{{ range recentPullRequests 3 }}
- [{{ .Title }}]({{ .URL }}) · <sub>{{ .Repo.Name }}</sub>
{{- end }}
