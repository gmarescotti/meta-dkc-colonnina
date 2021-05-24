
SUMMARY = "django-taggit is a reusable Django application for simple tagging."
HOMEPAGE = "https://github.com/jazzband/django-taggit"
AUTHOR = "Alex Gaynor <alex.gaynor@gmail.com>"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=59ea0741c61ed3d340cb1a97c8020e3f"

SRC_URI = "https://files.pythonhosted.org/packages/8a/6d/c8f6098af30cae71c5afc5510523808dd5687e2e688c0f08e9e329f1c8d5/django-taggit-1.4.0.tar.gz"
SRC_URI[md5sum] = "56dfb1d3f09191152b908d180035e1de"
SRC_URI[sha256sum] = "b9ed6e94bad0bed3bf062a6be7ee3db117fda02c6419c680d614197364ea018b"

S = "${WORKDIR}/django-taggit-1.4.0"

RDEPENDS_${PN} = ""

inherit setuptools3
