<p align="center">
  <img src=""https://capsule-render.vercel.app/api?type=waving&color=0:2E3440,100:5E81AC&height=200&section=header&text=hcg-leo&fontSize=60&fontAlignY=35&fontColor=ECEFF4&animation=fadeIn&desc=leo%20the%20cat&descAlignY=55&descSize=18"" />
</p>

### github stats

[![Metrics](https://github.com/hcg-leo/hcg-leo/raw/main/github-metrics.svg)](https://github.com/hcg-leo/hcg-leo/blob/main/github-metrics.svg)

### check out what i'm currently working on
{{ range recentContributions 5 }}
- [{{ .Repo.Name }}]({{ .Repo.URL }}) - {{ .Repo.Description }}
{{- end }}

### my latest projects
{{ range recentRepos 5 }}
- [{{ .Name }}]({{ .URL }}) - {{ .Description }}
{{- end }}

### my recent pull requests
{{ range recentPullRequests 5 }}
- [{{ .Title }}]({{ .URL }}) on [{{ .Repo.Name }}]({{ .Repo.URL }})
{{- end }}

### recent stars
{{ range recentStars 5 }}
- [{{ .Repo.Name }}]({{ .Repo.URL }}) - {{ .Repo.Description }}
{{- end }}

### how to reach me

<!-- Add real links here, e.g.:
- Website : <https://example.com>
-->
